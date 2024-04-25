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
                Storage.result = addOperation.operate(numbers)
            }

            '-' -> {
                Storage.result = substractOperation.operate(numbers)
            }

            '*' -> {
                Storage.result = multiplyOperation.operate(numbers)
            }

            '/' -> {
                Storage.result = dvideOperation.operate(numbers)
            }
        }
    }
}