fun main() {
    val inputResult = Guidance().usageGuide()
    inputResult?.let { Storage().save(values = it) }
}
