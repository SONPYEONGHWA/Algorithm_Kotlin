import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/** 최댓값 구하기 **/

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = IntArray(9)
    repeat(9) {
        numbers[it] = readLine().toInt()
    }
    val max = Arrays.stream(numbers).max().asInt
    writer.write(max.toString())
    writer.write("${numbers.indexOf(max)+1}")
    writer.flush()
    writer.close()
    close()
}