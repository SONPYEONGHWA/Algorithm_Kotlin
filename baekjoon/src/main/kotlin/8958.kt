import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/** 8958번 OX문제 **/

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//    repeat(readLine().toInt()) {
//        val list = readLine().split("X").filter { it.isNotEmpty() }
//        var sum = 0
//        list.forEach {
//            sum += (1 .. it.chars().count()).sum().toInt()
//        }
//        writer.write("${sum}\n")
//    }
//    writer.flush()
//    writer.close()
//    close()
//}


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()) {
        var sum = 0
        var count = 0
        readLine().forEach {
            if (it == 'O') {
                count++
                sum += count
            } else {
                count = 0
            }
        }
        writer.write("${sum}\n")
    }
    writer.flush()
    writer.close()
    close()
}
