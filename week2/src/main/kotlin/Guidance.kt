class Guidance {

    fun usageGuide() {
        println("========= 계산기 ==========")
        println("계산할 식을 입력해주세요.")
        println("예) 2 + 5 * 4 / 3")
        println("계산기 종료 : x")
        print("계산식 : ")

        val input = readln()

        if (input == "x") {
            return println("계산기를 종료합니다.")
        }

        Storage().save(values = input)
    }

    fun resultGuide(result: Number) {
        println("계산된 결괏값을 안내드립니다.")
        println("결괏값 : $result")
    }

    fun errorGuide(errorMessage: String) {
        println(errorMessage)
        println("다시 작성해 주세요.")
        usageGuide()
    }
}