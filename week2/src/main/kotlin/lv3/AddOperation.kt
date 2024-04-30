package lv3

class AddOperation : Calculator<Int>() {
    override fun operate(firstNumber: Int, secondNumber: Int) = firstNumber + secondNumber
}