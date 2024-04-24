class Storage {
    companion object {
        val numbersStorage = mutableListOf<Number>()
        val symbolsStorage = mutableListOf<Char>()
        var result: Number = 0
            set(value) {
                field = value

                Calculator().next()
            }
    }

    private val symbol = listOf('+', '-', '*', '/')

    fun save(values: String) {
        val guidance = Guidance()
        var tempSymbol = ""
        var number = ""

        if (values.isNotBlank() && Character.getNumericValue(values[values.length - 1]) == -1) {
            guidance.errorGuide("식의 마지막은 숫자로 끝나야 합니다.")
        }

        values.forEach {
            if (symbol.contains(it)) {

                if (it == '-' && number.isEmpty()) {
                    tempSymbol = "-"
                } else {
                    symbolsStorage.add(it)
                    tempSymbol = ""
                }

                if (number.isNotBlank()) {

                    try {
                        numbersStorage.add(number.toLong())
                    } catch (exception: NumberFormatException) {
                        guidance.errorGuide("최대 입력 가능 숫자를 초과 했습니다.")
                    }
                }

                number = ""
            } else if (Character.getNumericValue(it) != -1 && it != ' ') {
                if (tempSymbol.isNotBlank()) {
                    number = tempSymbol + it
                    tempSymbol = ""
                } else {
                    number += it
                }
            }
        }

        if (number.isNotBlank()) {
            numbersStorage.add(number.toLong())
        }

        if (numbersStorage.isEmpty() || symbolsStorage.isEmpty()) {
            guidance.errorGuide("정확한 식이 아닙니다.")
        }

        result = numbersStorage[0]
    }
}