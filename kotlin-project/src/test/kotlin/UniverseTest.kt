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
                    write("""
                        |* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • 
                        |           　★ °  ☆ ¸. ¸ 　★　 :.　 .   
                        |__.-._     ° . .　　　　.　☾ ° 　. *   ¸ .
                        |'-._\7'      .　　° ☾  ° 　¸.☆  ● .　　　
                        | /'.-c    　   * ●  ¸.　　°     ° 　¸.    
                        | |  /T      　　°     ° 　¸.     ¸ .　　
                        |_)_/LI
                    """.trimMargin())
                }
            } else {
                channel("Kudos 🌟") {
                    write("Did you know that in Kotlin you can use the sum() function directly on an Array? Try it!")
                    write("")
                    write("var galaxies = arrayOf(37, 3, 2)")
                    write("var totalStars = galaxies.sum() // 42")
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
