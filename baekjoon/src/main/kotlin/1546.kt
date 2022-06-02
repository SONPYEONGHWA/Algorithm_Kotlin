import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**  1546번
실제 정답과 출력값의 오차가 소수점 둘째짜리 이하이면 정답이기 때문에 단순히 integer형으로 계산하면 안된다.
double형으로 타입변환 후 계산 수행! **/

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    readLine()
    val scores = readLine().split(" ").map { it.toDouble() }
    val max = scores.maxOrNull() ?: 0.0
    writer.write(scores.map { it / max * 100 }.average().toString())
    writer.flush()
    writer.close()
    close()
}


