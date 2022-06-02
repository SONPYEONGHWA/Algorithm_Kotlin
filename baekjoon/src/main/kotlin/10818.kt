import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** 10818 최소 최대 **/
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    readLine()
    with(readLine().split(" ").map { it.toInt() }) {
        writer.write("${minOrNull()} ${maxOrNull()}")
    }

    writer.flush()
    writer.close()
    close()
}
