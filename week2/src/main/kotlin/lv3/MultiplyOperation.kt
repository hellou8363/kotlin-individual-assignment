package lv3

class MultiplyOperation: Calculator<Int>() {
    override fun operate(firstNumber: Int, secondNumber: Int) = firstNumber * secondNumber
}