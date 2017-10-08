package LatteFX

import javafx.application.Platform

/**
 * @author Ben Leggiero
 * @since 2017-10-02
 */

public inline fun onFxApplicationThread(crossinline operation: () -> Unit) {
    Platform.runLater {
        operation()
    }
}



public inline fun onEventThread(crossinline operation: () -> Unit) = onFxApplicationThread(operation)
