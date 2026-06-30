package aula_05_estruturas_condicionais

fun main() {

    // if / else / else if

    var x = 50
    var y = 150

    val result = if (x > y) {
        "X > Y"
    } else if (x < y) {
        "X < Y"
    } else if (x == y) {
        "X == Y"
    } else {
        "else"
    }

    println("if/ else if/ else:")
    println(result)

    // when

    val result2 = when(x) {
        in 1..100 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }

    println("when x:")
    println(result2)

    val result3 = when(y) {
        in 1..100 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }

    println("when y:")
    println(result3)
}