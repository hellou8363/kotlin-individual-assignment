package lv1

class Calculator {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val sub: (Int, Int) -> Int = { a, b -> a - b }
    val mul: (Int, Int) -> Int = { a, b -> a * b }
    val div: (Int, Int) -> Int = { a, b -> a / b }
}