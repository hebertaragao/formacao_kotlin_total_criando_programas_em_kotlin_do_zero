fun main(args: Array<String>) {
    imprimir()
    imprimirAlgo("Algo")
    println(somarDoisNumeros(4, 2))
    var somar = devolverSomatoria(5, 3)
    imprimirAlgo("somatoria: $somar")

}
fun imprimir(){
    println("imprimindo...")

}
fun imprimirAlgo(algo: String): Unit{
    println("imprimindo... $algo")

}
fun somarDoisNumeros(numeroA: Int, numeroB: Int){

    println(numeroA + numeroB)

}
fun devolverSomatoria(numeroA: Int, numeroB: Int): Int{
    return numeroA + numeroB

}