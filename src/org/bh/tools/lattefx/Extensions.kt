package LatteFX

import javafx.scene.control.*

/*
 * @author Ben Leggiero
 * @since 2018-05-13
 */


inline var MenuBar.useSystemMenuBar: Boolean
    get() = this.isUseSystemMenuBar
    set(value) { this.isUseSystemMenuBar = value }
