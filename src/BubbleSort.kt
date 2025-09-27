fun bubbleSort(vetor: IntArray) {
    val n = vetor.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (vetor[j] > vetor[j + 1]) {
                val temp = vetor[j]
                vetor[j] = vetor[j + 1]
                vetor[j + 1] = temp
            }
        }

        println("Após iteração ${i + 1}: ${vetor.joinToString()}")
    }
}

fun main() {
    val vetor = intArrayOf(5, 3, 2, 4, 7, 1, 0, 6)

    println("Vetor original: ${vetor.joinToString()}")
    println()

    bubbleSort(vetor)

    println()
    println("Vetor ordenado: ${vetor.joinToString()}")
}