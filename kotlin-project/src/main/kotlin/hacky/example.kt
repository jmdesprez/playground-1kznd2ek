package hacky

data class Galaxy(val stars: Int)

fun countStars(galaxies: List<Galaxy>): Int {
    var total = 0

    for (galaxy: Galaxy in galaxies) {
        total = galaxy.stars
    }

    return total
}