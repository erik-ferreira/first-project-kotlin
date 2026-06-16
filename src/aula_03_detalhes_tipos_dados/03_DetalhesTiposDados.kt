package aula_03_detalhes_tipos_dados

fun main() {
    val age: Int = 20

    // add month in format decimal on integer age (convert age a data type numeric float)

    var ageDouble: Double = age.toDouble()
    val monthPercent: Double = 1.0 / 12

    println("ageDouble = $ageDouble")
    println("monthPercent = $monthPercent")

    // 2 after month

    ageDouble += 2 * monthPercent

    println("ageDouble updated = $ageDouble")

    // show age em format string with model "The age is X years."

    val ageText: String = "The age is " + ageDouble.toString().plus(" years.")

    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())
}