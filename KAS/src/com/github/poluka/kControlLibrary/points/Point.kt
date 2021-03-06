package com.github.poluka.kControlLibrary.points

import com.github.poluka.kControlLibrary.Command
import com.github.poluka.kControlLibrary.program.Program
import com.github.poluka.kControlLibrary.utils.GenerateRandomString

class Point private constructor(
    var name: String = "",
    var x: Double = 0.0,
    var y: Double = 0.0,
    var z: Double = 0.0,
    var o: Double = 0.0,
    var a: Double = 0.0,
    var t: Double = 0.0,
) : Command {
    override fun generateCommand(): String {
        return "POINT $name = $x,$y,$z,$o,$a,$t"
    }

    override fun toString(): String {
        return "$x,$y,$z,$o,$a,$t"
    }

    companion object {
        fun createPoint(
            name: String = "",
            x: Double = 0.0,
            y: Double = 0.0,
            z: Double = 0.0,
            o: Double = 0.0,
            a: Double = 0.0,
            t: Double = 0.0,
        ): Point {
            var defName = name
            if (name == "") defName = GenerateRandomString.generateString(14)

            return createPoint(defName, x, y, z, o, a, t)
        }
    }
}

fun Program.POINT(
    name: String = "",
    x: Double = 0.0,
    y: Double = 0.0,
    z: Double = 0.0,
    o: Double = 0.0,
    a: Double = 0.0,
    t: Double = 0.0,
): Point {
    val point = Point.createPoint(name, x, y, z, o, a, t)
    add(point)

    return point
}
