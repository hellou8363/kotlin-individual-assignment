package lv4

fun main() {
    val guidance = Guidance()

    while (true) {
        guidance.usageGuide()

        val input = readln()

        if (input == "x") {
            println("계산기를 종료합니다.")
            break
        } else {
            try {
                Storage().save(input)
            } catch (e: NumberFormatException) {
                println(e.message)
            }
        }
    }
}
