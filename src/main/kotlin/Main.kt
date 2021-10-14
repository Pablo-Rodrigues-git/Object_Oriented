fun main (args: Array<String>){
    val arroz = Produto(nome = "Arroz", preco = 25.0)
    var joao: Cliente = Cliente(nome = "Joao", cpf = "123.456.789.00")
    val pedido = Pedido(joao)
}