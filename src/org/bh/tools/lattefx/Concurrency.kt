@file:Suppress("unused")

package LatteFX

import javafx.application.Platform

/**
 * @author Ben Leggiero
 * @since 2017-10-02
 */

inline fun onFxApplicationThread(crossinline operation: () -> Unit) {
    Platform.runLater {
        operation()
    }
}


inline fun onEventThread(crossinline operation: () -> Unit) = onFxApplicationThread(operation)
