package LatteFX

import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.scene.layout.Region

/**
 * @author Ben Leggiero
 * @since 2017-10-02
 */


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
 * The base class of all JavaFX components in a hierarchy
 */
typealias LatteComponent = Node

/**
 * The base class of all JavaFX components in a hierarchy
 */
typealias FXComponent = Node



/**
 * The most basic JavaFX component that can contain another component (Branch node)
 */
typealias LatteContainer = Region

/**
 * The most basic JavaFX component that can contain another component (Branch node)
 */
typealias FXContainer = Region


/**
 * The wrapper around the content of this window
 */
var LatteWindow.contentWrapper: LatteComponentWrapper?
    get() {
        return this.scene
    }
    set(newScene) {
        this.scene = newScene
    }


//fun LatteContainer.add(child: LatteComponent) {
//    this.getChildren().add(child)
//}
