class Pedido (val cliente: Cliente) {
    // Using defensive programming
    private val listaDeProdutos = mutableListOf<ItemPedido>()
    val itens
        get() = listaDeProdutos.toMutableList()

    fun adicionaProduto(itemPedido: ItemPedido) {
        listaDeProdutos.add(itemPedido)
    }

}