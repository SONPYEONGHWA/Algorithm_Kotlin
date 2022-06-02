import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** 1065번 한수 **/

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0
    (1..readLine().toInt()).forEach {
        var num = it
        var diffList = mutableListOf<Int>()
        while (num >= 10) {
            diffList.add((num % 10) - ((num / 10) % 10))
            num /= 10
        }
        if (diffList.distinct().count() == 1 || diffList.isEmpty()) count++
    }
    writer.write("$count")
    writer.flush()
    writer.close()
    close()
}