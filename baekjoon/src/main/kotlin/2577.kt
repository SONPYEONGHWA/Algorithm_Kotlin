import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** 2577 숫자의 개수 **/
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var multiple = 1
    repeat(3) {
        multiple *= readLine().toInt()
    }

    (0..9).forEach { number ->
        val count = multiple.toString().count { it.toString() == number.toString() }
        writer.write("${count}\n")
    }

    writer.flush()
    writer.close()
    close()
}