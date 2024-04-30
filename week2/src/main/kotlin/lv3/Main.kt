package lv3

fun main() {
    val add = AddOperation()
    println(add.operate(2, 3)) // 5

    val sub = SubstractOperation()
    println(sub.operate(5, 3)) // 2

    val mul = MultiplyOperation()
    println(mul.operate(6, 6)) // 36

    val div = DivideOperation()
    println(div.operate(6.0, 2.5)) // 2.4
}