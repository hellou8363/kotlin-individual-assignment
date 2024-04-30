package lv3

abstract class Calculator<T> {
    abstract fun operate(firstNumber: T, secondNumber: T): T
}