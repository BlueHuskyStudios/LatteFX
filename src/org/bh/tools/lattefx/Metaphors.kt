package LatteFX

import javafx.scene.*
import javafx.scene.layout.*
import javafx.stage.*


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
