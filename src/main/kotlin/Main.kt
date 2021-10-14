fun main() {
    val name = "Zeyad"
    var healthPoints = 70

    val good = true
    val notgood = false

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()


    val auraVisible = good && healthPoints > 50 || notgood
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> ""
    }

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (good) {
            "karma is ok!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "in pain."
        else -> "is in awful condition!"
    }

    val statusFormatString = "(B: ${if (good) "YES" else "NO"}) " +
            "(healthPoints: $healthPoints) (A: ${if (auraVisible) auraColor else "NONE"}) -> $name $healthStatus"

    println(statusFormatString)
}