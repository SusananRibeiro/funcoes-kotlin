package funcoes
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for(e in lista) {
        if(filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada // retorna uma nova lista e não mexe na lista original
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}