fun interface Operation {
    fun operate(numbers: List<Number>): Number
}

val addOperation = Operation { numbers: List<Number> -> numbers[0].toLong() + numbers[1].toLong() }

val substractOperation = Operation { numbers: List<Number> -> numbers[0].toLong() - numbers[1].toLong() }

val multiplyOperation = Operation { numbers: List<Number> -> numbers[0].toLong() * numbers[1].toLong() }

val dvideOperation = Operation { numbers: List<Number> -> numbers[0].toDouble() / numbers[1].toDouble() }