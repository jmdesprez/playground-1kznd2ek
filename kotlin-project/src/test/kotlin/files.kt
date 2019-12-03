import java.io.File
import java.util.*

fun File.anyLine(lineChecker: (String) -> Boolean): Boolean {
    Scanner(this).use { scanner ->
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            if (lineChecker(line))
                return true
        }
        return false;
    }
}
