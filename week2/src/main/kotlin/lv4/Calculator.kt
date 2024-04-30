class Calculator {

    fun operate(symbol: String, numbers: List<Number>): Number {

        return when (symbol) {
            "+" -> {
                addOperation.operate(numbers)
            }

            "-" -> {
                substractOperation.operate(numbers)
            }

            "*" -> {
                multiplyOperation.operate(numbers)
            }

            "/" -> {
                DivideOperation().operate(numbers)
            }
            else -> throw NumberFormatException("계산 중 문제가 발생했습니다.")
        }
    }
}