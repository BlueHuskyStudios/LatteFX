package LatteFX

import javafx.scene.Group
import javafx.scene.Node

/**
 * @author Ben Leggiero
 * @since 2017-10-01
 */
class LatteGroup
    private constructor(children: MutableCollection<Node>?)
    : Group(children)
{
    companion object {
        val main: LatteGroup by lazy { LatteGroup(children = mutableListOf()) }
    }
}