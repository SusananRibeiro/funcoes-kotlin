package funcoes
fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null // usando um generics "< >", "E" é o nome, pode ser qualquer outro nome
fun main(args: Array<String>) {
    val list = listOf("João", "Maria", "Pedro")
    print(list.secondOrNull())
}
