package lv4

class Validation {
    private val symbols = listOf('+', '-', '*', '/')
    private val numbersStorage = mutableListOf<Number>()
    private val symbolsStorage = mutableListOf<Char>()
    private var result: Number = 0

    fun validateInputValue(value: String): List<List<Any>> {
        var tempSymbol = ""
        var number = ""

        if (value.isBlank()) { // 빈 값또는 공백일 경우
            throw Exception("정확한 식이 아닙니다..")
        }

        if (!'0'.rangeTo('9').contains(value.last())) { // 마지막 값이 0~9에 속하지 않는 경우
            throw NumberFormatException("정확한 식이 아닙니다.")
        }

//        value.forEach { // 입력값에 symbols에 속한 기호와 숫자외 문자 허용 X
        for (v in value) {


            if (symbols.contains(v)) { // +, -, *, /인지 체크
                if (v == '-' && number.isBlank()) { // 현재 값이 -이고 number가 빈 값인 경우
                    tempSymbol = "-" // 음수 값 처리를 위한 임시 저장
                } else { // 기호가 -가 아닌 경우
                    symbolsStorage.add(v) // 기호를 저장
                    if (number.isNotBlank()) {
                        numbersStorage.add(number.toLong()) // 숫자를 저장
                        tempSymbol = ""
                        number = ""
                    }
                }
            }

            if (!symbols.contains(v) && v != ' ') {
                try {
                    number += tempSymbol + v.toString().toLong()
                    tempSymbol = ""
                } catch (e: NumberFormatException) {
                    throw NumberFormatException("정확한 식이 아닙니다.")
                }

            }
        }

        // 마지막 숫자에 대한 처리
        try {
//            number += value.last().toString()
            numbersStorage.add(number.toLong())
        } catch (e: NumberFormatException) {
            throw NumberFormatException("정확한 식이 아닙니다.")
        }

        // 1. 기호 없이 숫자만 입력되는 경우에 대한 처리
        // 2. 기호, 숫자가 입력되었으나 숫자가 1개인 경우
        if (symbolsStorage.isEmpty() || numbersStorage.size - symbolsStorage.size != 1) {
            throw Exception("정확한 식이 아닙니다.")
        }

        return arrayListOf(symbolsStorage, numbersStorage)
    }
}