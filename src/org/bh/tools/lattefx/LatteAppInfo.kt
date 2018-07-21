@file:Suppress("PackageDirectoryMismatch")
package LatteFX

/**
 * @author Ben Leggiero
 * @since 2018-05-13
 */
interface LatteAppInfo {
    val appName: String
}

interface LatteAppConfig {
    val automaticallySetUpSystemMenuBar: Boolean
    val automaticallyGeneratePrimaryWindow: Boolean get() = true
    val primaryParent: PaneOrGroup<*>?
    val startingWrapperGenerator: (() -> LatteComponentWrapper)?
}
