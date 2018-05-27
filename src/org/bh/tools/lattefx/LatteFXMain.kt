@file:Suppress("PackageDirectoryMismatch")
package LatteFX

import LatteFX.LatteGroup.Companion.mainGroup
import LatteFX.PaneOrGroup.*
import javafx.application.*
import javafx.scene.control.*

/**
 * Usage:
 * ```
 *  class Main : LatteFXMain({ commandLineArguments, primaryWindow ->
 *      primaryWindow!!.contentWrapper = MyContentWrapper()
 *      primaryWindow.show()
 *  })
 * ```
 *
 * @author Ben Leggiero
 * @since 2017-10-02
 */
abstract class LatteFXMain(
        val appInfo: LatteAppInfo? = null,
        val appConfig: LatteAppConfig? = null,
        private val onStart: (commandLineArguments: Array<String>, LatteWindow?) -> Unit
) : Application() {
    override fun start(primaryWindow: LatteWindow?) {
        if (null != appInfo) {
            if (null != appConfig) {
                if (appConfig.automaticallySetUpSystemMenuBar) {
                    val group = appConfig.primaryParent ?: group(mainGroup)
                    group.children.add(SystemMenuBar(appInfo))
                }

                if (null != primaryWindow) {
                    primaryWindow.title = appInfo.appName
                    appConfig.startingWrapperGenerator?.invoke().let {
                        primaryWindow.contentWrapper = it
                    }
                }
            }
        }
        
        onStart(super.getParameters().raw.toTypedArray(), primaryWindow)
    }
}



private class SystemMenuBar(val appInfo: LatteAppInfo): MenuBar() {
    init {
        this.useSystemMenuBar = true
        val appMenu = Menu(appInfo.appName)
        this.menus += appMenu
    }
}
