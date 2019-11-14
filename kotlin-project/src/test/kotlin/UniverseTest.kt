import org.junit.Test
import java.io.File
import java.util.*

class UniverseTest {

    @Test
    fun test() {
        try {
            //			Assert.assertEquals("Running countAllStars(2, 3)...", 5, 5)
            success(true)

            if (existsInFile("galaxies.sum()", File("src/main/kotlin/bowling/bowling.kt"))) {
                channel("My personal Yoda, you are. 🙏") {
                    msg("* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ")
                    msg("           　★ °  ☆ ¸. ¸ 　★　 :.　 .   ")
                    msg("__.-._     ° . .　　　　.　☾ ° 　. *   ¸ .")
                    msg("'-._\\7'      .　　° ☾  ° 　¸.☆  ● .　　　")
                    msg(" /'.-c    　   * ●  ¸.　　°     ° 　¸.    ")
                    msg(" |  /T      　　°     ° 　¸.     ¸ .　　  ")
                    msg("_)_/LI");
                }
            } else {
                channel("Kudos 🌟") {
                    msg("Did you know that in Kotlin you can use the sum() function directly on an Array? Try it!")
                    msg("")
                    msg("var galaxies = arrayOf(37, 3, 2)")
                    msg("var totalStars = galaxies.sum() // 42")
                }
                annotate(
                    "src/main/kotlin/bowling/bowling.kt",
                    4,
                    "test annotation \"ok\"",
                    17,
                    AnnotateType.INFO,
                    "annotation_test"
                )
            }
        } catch (ae: AssertionError) {
            success(false)
            msg("Oops! 🐞", ae.message)
            msg("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔")
        }
    }

    // check if a string exists in a text file
    fun existsInFile(str: String, file: File): Boolean {
        Scanner(file).use { scanner ->
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true
            }
            return false;
        }
    }
}
