package LatteFX

import javafx.application.Application
import javafx.stage.Stage

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
public abstract class LatteFXMain(private val onStart: (commandLineArguments: Array<String>, primaryWindow: Stage?) -> Unit) : Application() {
    override fun start(primaryWindow: LatteWindow?) {
        onStart(super.getParameters().raw.toTypedArray(), primaryWindow)
    }
}
