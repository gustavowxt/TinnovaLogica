fun fatorial(n: Int): Long {
    var resultado = 1L
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    val resultado = fatorial(numero)
    println("O fatorial do $numero é $resultado")
}