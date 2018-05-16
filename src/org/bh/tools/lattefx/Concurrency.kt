@file:Suppress("unused", "PackageDirectoryMismatch")

package LatteFX

import javafx.application.*

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
