package lv2

fun main() {
    val calculator = Calculator()

    println(calculator.add(2, 3)) // 5
    println(calculator.sub(7, 3)) // 4
    println(calculator.mul(5, 6)) // 30
    println(calculator.div(12, 3)) // 4
    println(calculator.mod(9, 5)) // 4
}