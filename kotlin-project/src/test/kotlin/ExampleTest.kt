import hacky.Galaxy
import hacky.countStars
import org.junit.Assert
import org.junit.Test
import java.io.File

class ExampleTest {

    @Test
    fun test() {
        try {
            val total = countStars(
                listOf(
                    Galaxy(100),
                    Galaxy(23)
                )
            )

            Assert.assertEquals("Les calculs sont pas bon Kévin",123, total)

            if (File("src/main/kotlin/hacky/example.kt").anyLine() {
                    it.contains(".sum()")
                }) {
                channel("Parfait !!") {
                    write("Kotlin propose pleins d'autres extensions");
                }
            } else {
                channel("Pas mal...") {
                    write("Mais Kotlin propose aussi pas mal d'extensions. Par example : ")
                    write("")
                    write("var galaxies = listOf(...)")
                    write("galaxies.sum()")
                }
            }
            success(true)
        } catch (ae: AssertionError) {
            success(false)
            message("Oops! 🐞", ae.message)
            message("Indice 💡", "Le code à une erreur")
            annotate(
                "src/main/kotlin/hacky/example.kt",
                9,
                "L'erreur est sur cette ligne",
                type = AnnotateType.INFO,
                channel = "Indice \uD83D\uDCA1"
            )
        }
    }
}
