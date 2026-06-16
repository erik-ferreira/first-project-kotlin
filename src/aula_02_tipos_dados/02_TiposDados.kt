package aula_02_tipos_dados

fun main() {
    // # Numbers integer
    // 8 bits resolution | interval de -128 até 127
    val byte: Byte = 127
    // 18 bits resolution | interval de -32.768 até 32.767
    val short: Short = 32_500
    // 32 bits resolution | interval de -2^31 até 2^31 - 1
    val int: Int = 1_000_000
    // 64 bits resolution | interval de -2^63 até 2^63 - 1
    val long: Long = 2_000_000_000L

    // # Numbers float
    // 32 bits resolution
    val float: Float = 3.14159f
    // 64 bits resolution
    val double: Double = 3.14

    // # Literals text
    // a single character must be enclosed in single quotes
    val char: Char = 'a'
    val string: String = "Hello World"
    val content: String = """
        Brazil will go far in the 2026 World Cup!
        GSW will be nba champions in 2027!
    """.trimIndent()
    val words = "$char $string $byte"
    val words2 = "$short $int $long"

    // Boolean
    val boolean: Boolean = true
}