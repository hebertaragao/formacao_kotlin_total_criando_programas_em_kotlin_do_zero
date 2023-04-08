fun main(args: Array<String>) {

    var produtoA = entrarDados("Digite o preço do produto A: 99.99-->")
    var quantidadeA = entrarDados("Digite a quantidade do produto A-->")

    var produtoB = entrarDados("Digite o preço do produto B: 99.99-->")
    var quantidadeB = entrarDados("Digite a quantidade do produto B-->")

    var precoUnidadeA = 0.00
    var precoUnidadeB = 0.00

    precoUnidadeA = produtoA / quantidadeA
    precoUnidadeB = produtoB / quantidadeB

    var precoKiloA = 0.00
    var precoKiloB = 0.00

    precoKiloA = precoUnidadeA * 1000
    precoKiloB = precoUnidadeB * 1000

    println("ProdutoA preço por Kg = R$ $precoKiloA")
    println("ProdutoB preço por Kg = R$ $precoKiloB")
    melhorCompra(precoKiloA, precoKiloB)

}
fun entrarDados(mensagem: String): Double{
    var valorEntradaDeDados: Double?

    do {
        println(mensagem)
        valorEntradaDeDados = readLine()!!.toDoubleOrNull()
    }while (valorEntradaDeDados == null)
    return valorEntradaDeDados
}
fun melhorCompra(a: Double, b: Double){
    if (a == b){
        println("Compre qualquer um dos produtos")
    }else if (a < b){
        println("Compre o produto A")
    }else{
        println("Compre o produto B")
    }

}