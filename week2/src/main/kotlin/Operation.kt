interface Operation {
    fun operate(numbers: List<Number>): Number
}

class AddOperation : Operation {
    override fun operate(numbers: List<Number>) = numbers[0].toLong() + numbers[1].toLong()
}

class SubstractOperation : Operation {
    override fun operate(numbers: List<Number>) = numbers[0].toLong() - numbers[1].toLong()
}

class MultiplyOperation : Operation {
    override fun operate(numbers: List<Number>) = numbers[0].toLong() * numbers[1].toLong()
}

class DivideOperation : Operation {
    override fun operate(numbers: List<Number>) = numbers[0].toDouble() / numbers[1].toDouble()
}