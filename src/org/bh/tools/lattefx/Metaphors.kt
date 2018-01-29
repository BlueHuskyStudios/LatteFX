package LatteFX

import javafx.application.Application
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.scene.layout.Region
import javafx.stage.Stage

/**
 * The main class/method of a LatteFX application
 *
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
abstract class LatteFXMain(private val onStart: (commandLineArguments: Array<String>, primaryWindow: Stage?) -> Unit) : Application() {
    override fun start(primaryWindow: LatteWindow?) {
        onStart(super.getParameters().raw.toTypedArray(), primaryWindow)
    }
}


/**
 * A standard container UI panel in JavaFX
 * @see [Pane]
 */
typealias LattePanel = Pane

/**
 * A standard container UI panel in JavaFX
 * @see [Pane]
 */
typealias FXPanel = Pane



/**
 * That which wraps itself around all [LatteViewBase]s in a hierarchy
 * @see Scene
 */
typealias LatteWindowContentView = Scene

/**
 * That which wraps itself around all [LatteComponent]s in a hierarchy
 * @see Scene
 */
typealias LatteComponentWrapper = Scene

/**
 * That which wraps itself around all [FXComponent]s in a hierarchy
 * @see Scene
 */
typealias FXComponentWrapper = Scene



/**
 * The base class of all JavaFX views in a hierarchy
 */
typealias LatteViewBase = Node

/**
 * The base class of all JavaFX components in a hierarchy
 */
typealias LatteComponent = Node

/**
 * The base class of all JavaFX components in a hierarchy
 */
typealias FXComponent = Node



/**
 * The most basic JavaFX view that can contain another component (Branch node)
 */
typealias LatteView = Region

/**
 * The most basic JavaFX view that can contain another component (Branch node)
 */
typealias FXView = Region

/**
 * The most basic JavaFX component that can contain another component (Branch node)
 */
typealias LatteContainer = Region

/**
 * The most basic JavaFX component that can contain another component (Branch node)
 */
typealias FXContainer = Region



/**
 * A JavaFX window
 * @see Stage
 */
public typealias LatteWindow = Stage

/**
 * A JavaFX window
 * @see Stage
 */
public typealias FXWindow = Stage



/**
 * The wrapper around the content of this window
 */
var LatteWindow.contentWrapper: LatteWindowContentView?
    get() {
        return this.scene
    }
    set(newScene) {
        this.scene = newScene
    }
