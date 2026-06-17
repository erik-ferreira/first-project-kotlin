package aula_04_operadores_logicos

fun main() {
    val a = true
    val b = false
    val c = true

    // AND operator (&&)
    val result = a && b
    val result2 = a && c
    println(result)
    println(result2)

    // OR operator (||)
    val result3 = a || b
    val result4 = a || c
    println(result3)
    println(result4)

    // NOT operator (!)
    val e = true
    val f = !e // false
    println("--- Operator not:")
    println(f)

    val num1 = 10
    val num2 = 5
    println("--- Equal to and different from operators:")
    // EQUAL operator (==)
    println(num1 == num2)
    // DIFFERENT operator (!=)
    println(num2 != num1)


    // operators IS THE TYPE and IS NOT THE TYPE (is e !is)
    val num: Any = 1
    val numText: Any = "1"
    println("--- IS OF THE TYPE operator:")
    println(num is String)
    println(numText is String)
    println("Operator IS NOT OF THE TYPE:")
    println(num !is String)
    println(numText !is String)

    // operators BOTH BELONGS and DOES NOT BELONG (in e !in)
    val range = 1..10
    val x = 5
    val y = 15


}