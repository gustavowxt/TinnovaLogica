class Eleicao(
    private val totalEleitores: Int,
    private val votosValidos: Int,
    private val votosBrancos: Int,
    private val votosNulos: Int
) {
    fun percentualValidos(): Double = (votosValidos.toDouble() / totalEleitores) * 100
    fun percentualBrancos(): Double = (votosBrancos.toDouble() / totalEleitores) * 100
    fun percentualNulos(): Double = (votosNulos.toDouble() / totalEleitores) * 100

    fun exibirResultados() {
        println("=== RESULTADOS ELEITORAIS ===")
        println("Total de eleitores: $totalEleitores")
        println("Votos válidos: $votosValidos (${"%.2f".format(percentualValidos())}%)")
        println("Votos brancos: $votosBrancos (${"%.2f".format(percentualBrancos())}%)")
        println("Votos nulos: $votosNulos (${"%.2f".format(percentualNulos())}%)")
        println("=============================")
    }
}

fun main() {
    val eleicao = Eleicao(
        totalEleitores = 1000,
        votosValidos = 800,
        votosBrancos = 150,
        votosNulos = 50
    )

    eleicao.exibirResultados()
}