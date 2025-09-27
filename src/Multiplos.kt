fun somaMultiplos(limite: Int): Int {
    if (limite <= 0) return 0

    var soma = 0
    for (i in 1 until limite) {
        if (i % 3 == 0 || i % 5 == 0) {
            soma += i
        }
    }
    return soma
}

fun main() {
    println("=== CALCULADORA DE MÚLTIPLOS DE 3 OU 5 ===")

    while (true) {
        print("\nDigite um número limite (ou 'sair' para encerrar): ")
        val input = readLine()

        if (input == "sair") {
            println("Programa encerrado!")
            break
        }

        try {
            val limite = input?.toInt() ?: 0

            if (limite <= 0) {
                println("Por favor, digite um número positivo maior que 0")
                continue
            }

            val resultado = somaMultiplos(limite)
            println("A soma de todos os múltiplos de 3 ou 5 abaixo de $limite é: $resultado")

            if (limite <= 100) {
                val multiplos = (1 until limite).filter { it % 3 == 0 || it % 5 == 0 }
                println("Múltiplos encontrados: ${multiplos.joinToString()}")
            }

        } catch (e: NumberFormatException) {
            println("Erro: Por favor, digite um número válido")
        }
    }
}