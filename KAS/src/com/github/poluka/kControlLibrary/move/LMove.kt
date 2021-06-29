package com.github.poluka.kControlLibrary.move

import com.github.poluka.kControlLibrary.Command
import com.github.poluka.kControlLibrary.points.Point
import com.github.poluka.kControlLibrary.program.Program

class LMove(private val point: Point) : Command {
    override fun generateCommand(): String {
        return "LMOVE ${if (point.name == "") point.toString() else point.name }"
    }
}

fun Program.LMOVE(point: Point) = this.add(LMove(point))
