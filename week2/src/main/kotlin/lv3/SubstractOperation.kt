package lv3

class SubstractOperation: Calculator<Int>() {
    override fun operate(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber
}