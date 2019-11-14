import org.junit.Test
import java.io.File
import java.util.*

class UniverseTest {

    @Test
    fun test() {
        try {
            //			Assert.assertEquals("Running countAllStars(2, 3)...", 5, 5)
            success(true)

            if (existsInFile("bowling", File("src/main/kotlin/bowling/bowling.kt"))) {
                channel("My personal Yoda, you are. 🙏") {
                    message("* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ")
                    message("           　★ °  ☆ ¸. ¸ 　★　 :.　 .   ")
                    message("__.-._     ° . .　　　　.　☾ ° 　. *   ¸ .")
                    message("'-._\\7'      .　　° ☾  ° 　¸.☆  ● .　　　")
                    message(" /'.-c    　   * ●  ¸.　　°     ° 　¸.    ")
                    message(" |  /T      　　°     ° 　¸.     ¸ .　　  ")
                    message("_)_/LI");
                }
            } else {
                channel("Kudos 🌟") {
                    message("Did you know that in Kotlin you can use the sum() function directly on an Array? Try it!")
                    message("")
                    message("var galaxies = arrayOf(37, 3, 2)")
                    message("var totalStars = galaxies.sum() // 42")
                    annotate(
                        "src/main/kotlin/bowling/bowling.kt",
                        4,
                        "test annotation \"ok\"",
                        17,
                        AnnotateType.INFO
                    )
                }
            }
        } catch (ae: AssertionError) {
            success(false)
            message("Oops! 🐞", ae.message)
            message("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔")
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
