@file:Suppress("PackageDirectoryMismatch")
package LatteFX

import LatteFX.LatteGroup.Companion.mainGroup
import javafx.collections.*
import javafx.scene.*
import javafx.scene.layout.*


/**
 * @author Ben Leggiero
 * @since 2017-10-01
 */
class LatteGroup
    private constructor(children: MutableCollection<Node>?)
    : Group(children)
{
    companion object {
        val mainGroup: LatteGroup by lazy { LatteGroup(children = mutableListOf()) }
    }
}



sealed class PaneOrGroup<Resolved: Parent>(val resolved: Resolved) {
    class pane(pane: Pane): PaneOrGroup<Pane>(pane)
    class group(group: Group): PaneOrGroup<Group>(group) {
        companion object {
            val main = group(mainGroup)
        }
    }

    val children: ObservableList<Node> @JvmName("children") get() = when (this) {
        is pane -> resolved.children
        is group -> resolved.children
    }
}
