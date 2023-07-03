package funcoes
// UNIT por padrão - declarado implicitamente
fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}
// UNIT - declarado explicitamente
fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}
// chamar o return vazio de forma explícita
fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}
// chamar o return de forma explícita
fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}
// UNIT padrão, mas que chamar o return de forma explícita
fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}
fun main(args: Array<String>) {
    imprimeMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(2, 1)
    imprimeMaior4(2, 1)
    imprimeMaior5(2, 1).run { 2 > 4 }.run { print("Resultado = $this") } // usando função lambda ".run"
}
