fun main() {
    Guidance().usageGuide()
}

class Calculator {
    companion object {
        private var order = 0
    }

    fun next() {

        val numbersStorage = Storage.numbersStorage
        val symbolsStorage = Storage.symbolsStorage

        if (order == symbolsStorage.size) {
            return Guidance().resultGuide(Storage.result)
        }

        var symbol = symbolsStorage[order]
        val numbers = listOf(Storage.result, numbersStorage[order + 1])

        order++

        when (symbol) {
            '+' -> {
                Storage.result = AddOperation().operate(numbers)
            }

            '-' -> {
                Storage.result = SubstractOperation().operate(numbers)
            }

            '*' -> {
                Storage.result = MultiplyOperation().operate(numbers)
            }

            '/' -> {
                Storage.result = DivideOperation().operate(numbers)
            }
        }
    }
}