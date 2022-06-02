import java.io.BufferedWriter
import java.io.OutputStreamWriter

/** 4673번 셀프 넘버 **/
fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val result = (1..10000).toMutableList()
    (1..10000).forEach { result.remove(getD(it)) }
    result.forEach {
        writer.write("${it}\n")
    }
    writer.flush()
    writer.close()
}

fun getD(value: Int): Int {
    var sum = value
    var num = value

    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}