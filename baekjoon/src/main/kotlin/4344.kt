import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** 4344번 평균은 넘겠지 **/

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val values = readLine().split(" ")
        values.map { it.toDouble() }.drop(1).run {
            val answer = (count { it > average() }.toDouble() / count().toDouble()) * 100
            writer.write("${String.format("%.3f%%", answer)}\n")
        }
    }
    writer.flush()
    writer.close()
    close()
}