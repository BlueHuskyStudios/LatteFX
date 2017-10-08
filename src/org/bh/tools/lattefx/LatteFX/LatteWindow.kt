@file:JvmName("LatteWindowUtils")

package LatteFX

import com.sun.org.apache.xpath.internal.operations.Bool
import javafx.application.Platform
import javafx.scene.Group
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.lang.reflect.Constructor
import kotlin.reflect.KClass

/**
 * @author Ben Leggiero
 * @since 2017-10-01
 */

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



public fun <WindowType: LatteWindow> show(windowClass: KClass<WindowType>, wait: Boolean = false): WindowType {
    return show(windowClass = windowClass.java, wait = wait)
}
public fun <WindowType: LatteWindow> show(windowClass: Class<WindowType>, wait: Boolean = false): WindowType {
    val constructors: Array<out Constructor<WindowType>>

    try {
        @Suppress("UNCHECKED_CAST")
        constructors = windowClass.constructors as Array<out Constructor<WindowType>>
    }
    catch (cce: ClassCastException) {
        throw IllegalArgumentException("Window class' constructors don't construct the right stuff")
    }

    val defaultConstructor = constructors.filter {
        val parameterTypes = it.parameterTypes
        return@filter parameterTypes.size == 0
    }
            .firstOrNull()
            ?: throw IllegalArgumentException("Window class must be instantiatable by passing zero arguments")

    val newInstance = windowClass.newInstance()

    newInstance.show(wait = wait)

    return newInstance
}


fun LatteWindow.showSafely(wait: Boolean) {
    if (Platform.isFxApplicationThread()) {
        show(wait = wait)
    }
    else {
        onFxApplicationThread {
            show(wait = wait)
        }
    }
}


fun LatteWindow.show(wait: Boolean) {
    if (wait) {
        showAndWait()
    } else {
        show()
    }
}
