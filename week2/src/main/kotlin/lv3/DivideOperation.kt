package lv3

class DivideOperation : Calculator<Double>() {
    override fun operate(firstNumber: Double, secondNumber: Double): Double = firstNumber / secondNumber
}