package LatteFX

import javafx.scene.*

/**
 * @author Ben Leggiero
 * @since 2018-05-13
 */
interface LatteAppInfo {
    val appName: String
}

interface LatteAppConfig {
    val automaticallySetUpSystemMenuBar: Boolean
    val primaryGroup: Group?
    val startingWrapperGenerator: (() -> LatteComponentWrapper)?
}