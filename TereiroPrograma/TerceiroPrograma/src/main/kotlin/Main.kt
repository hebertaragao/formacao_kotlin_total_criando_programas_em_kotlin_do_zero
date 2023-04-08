fun main(args: Array<String>) {
    val cidade: String = "Paris"
    val nomeCompleto: String = "João José"
    val precoHospedagem: Double = 123.45

    imprimir(cidade, nomeCompleto, precoHospedagem)
}

fun imprimir(cidade: String, nomeCompleto: String, precoHospedagem: Double){
    println("\n\n*****\nCidade $cidade nome do hóspede $nomeCompleto valor da diária $precoHospedagem\n*****")
}