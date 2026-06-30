package aula_06_1_controle_de_excecoes

import java.security.InvalidParameterException

fun main() {
    var x = 1

    x = try {
        // throw InvalidParameterException()
        // println(x)
        1/0
    } catch (e: ArithmeticException) {
        // println("Erro de expressão aritmética.")
        3
    } catch (e: Exception) {
        // println("Erro genérico.")
        4
    }
}