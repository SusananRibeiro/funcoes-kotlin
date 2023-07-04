package funcoes
class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int { // nessa parte diz que quer uma função "funcao:", que passe dois parâmetros inteiro "(Int, Int)" e retorne um inteiro "-> Int", fica assim: "funcao: (Int, Int) -> Int)"
    return funcao(a, b)
}

fun main(args: Array<String>) {
    println(calc(2, 3, Operacoes()::somar)) // primerio instancia a classe "Operacoes()", depois usa os "::" para chamar a função top level
    println(calc(2, 3, ::somar)) // "::" também é usado para chamar uma função top level, ex: "somar"
}
