import com.github.poluka.kControlLibrary.move.LMOVE
import com.github.poluka.kControlLibrary.points.HERE
import com.github.poluka.kControlLibrary.points.POINT
import com.github.poluka.kControlLibrary.program.motion

fun main() {
    val move = motion {

        val point = POINT(name = "home")

        HERE(point)
        LMOVE(point)
    }

    print(move.getProgram().joinToString("\n"))
}
