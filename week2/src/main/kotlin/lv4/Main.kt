package lv4

import Calculator

fun main() {
    val calculator = Calculator()
    var order = 0
    lateinit var result: Number

    println("========= 계산기 ==========")
    println("계산할 식을 입력해주세요.")
    println("예) 2 + 5 * 4 / 3")
    println("계산기 종료 : x")
    print("계산식 : ")

    // 사용자에게 계산식을 입력 받음
    val input = readln()

    if (input == "x") { // 입력값이 "x"이면 종료
        println("계산기를 종료합니다.")
    } else {
        try {
            // 유효한 식인지 검증
            val value = Validation().validateInputValue(input)
            val symbols = value[0].map { it.toString() }
            val numbers = value[1].map { it.toString().toLong() }

            // 저장된 값으로 계산
            result = numbers[order]
            while (order < symbols.size) {
                result = calculator.operate(symbols[order], arrayListOf(result, numbers[order + 1]))
                order++
                println("order ===> $order")
            }

            println("계산된 결괏값을 안내드립니다.")
            println("결괏값 : $result")


            // 결과 출력
        } catch (e: NumberFormatException) {
            println(e.message)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}
