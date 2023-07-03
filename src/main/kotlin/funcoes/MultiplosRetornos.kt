package funcoes
import java.util.*
data class Horario(val hora: Int, val minuto: Int, val segundo: Int)
fun agora(): Horario {
    val agora = Calendar.getInstance() // "Calendar" é do Java, mas está obsoleta, melhor usar a "API java.time"

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}
fun main(args: Array<String>) {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}