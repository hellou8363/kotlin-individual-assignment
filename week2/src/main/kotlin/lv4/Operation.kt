fun interface Operation {
    fun operate(numbers: List<Number>): Number
}

val addOperation = Operation { numbers: List<Number> -> numbers[0].toLong() + numbers[1].toLong() }

val substractOperation = Operation { numbers: List<Number> -> numbers[0].toLong() - numbers[1].toLong() }

val multiplyOperation = Operation { numbers: List<Number> -> numbers[0].toLong() * numbers[1].toLong() }

class DivideOperation : Operation {
    override fun operate(numbers: List<Number>): Number {

        println("numbers = ${numbers}")
        println(numbers[0] == 0)
        println(numbers[1])
        if (numbers[0] == 0L || numbers[1] == 0L) {
            throw ArithmeticException("0으로 나눌 수 없습니다.")
        }

        return numbers[0].toDouble() / numbers[1].toDouble()
    }
}
