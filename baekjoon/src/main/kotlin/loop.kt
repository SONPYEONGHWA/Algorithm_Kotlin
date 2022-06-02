import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val input = Integer.parseInt(StringTokenizer(readln()).nextToken())
//    (1..9).forEach {b ->
//        println("$input * $b = ${input * b}")
//    }
//    val a = Integer.parseInt(readLine())
//    val b = Integer.parseInt(readln())
//    print("${a+b}")
//}


// A+B, 첫줄에는 테스트 케이스의 갯수가 주어짐. 이후 각 테스트 케이스가 입력.
//fun main() = with(Scanner(System.`in`)) {
//    repeat(nextInt()) {
//        println(nextInt() + nextInt())
//    }
//}

// 1부터 n까지의 수가 주어졌을 때 합을 구하는 프로그램
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    var sum = 0
//    (0..readLine().toInt()).forEach {
//        sum += it
//    }
//    print(sum)
//}

//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    val n = br.readLine().toInt()
//    for (i in 1..n){
//        val token = StringTokenizer(br.readLine())
//        val sum = token.nextToken().toInt()+token.nextToken().toInt()
//        bw.write(sum.toString()+"\n");
//    }
//    br.close()
//    bw.flush()
//    bw.close()
//}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    (1..readLine().toInt()).forEach {
//        val token = StringTokenizer(readLine())
//        bw.write("${token.nextToken().toInt()+token.nextToken().toInt()}\n")
//    }
//
//    close()
//    bw.flush()
//    bw.close()
//}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//    (1..readLine().toInt()).forEach {
//        val stringTokenizer = StringTokenizer(readLine())
//        val first = stringTokenizer.nextToken().toInt()
//        val second = stringTokenizer.nextToken().toInt()
//        writer.write("Case #${it}: $first + $second = ${first + second}\n")
//    }
//    close()
//    writer.flush()
//    writer.close()
//}

// 별찍기
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//    val count = readLine().toInt()
//    (1.. count).forEach {
//        writer.write(" ".repeat(count - it) + "*".repeat(it) + "\n")
//    }
//    close()
//    writer.flush()
//    writer.close()
//}


// x보다 작은 수
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//    val x = readLine().split(" ")[1].toInt()
//    var result = ""
//    readLine().split(" ").forEach {
//        if (it.toInt() < x) result = "$result $it"
//    }
//    writer.write(result)
//    close()
//    writer.flush()
//    writer.close()
//}

// A + B - 4
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//
//    while (true) {
//        val input = readLine()
//        if (!input.isNullOrEmpty()) {
//            val stringTokenizer = StringTokenizer(input)
//            val first = stringTokenizer.nextToken().toInt()
//            val second = stringTokenizer.nextToken().toInt()
//            writer.write("${first + second}\n")
//        } else {
//            break
//        }
//    }
//
//    close()
//    writer.flush()
//    writer.close()
//}

// 더하기 사이클
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var number = readLine().toInt()
    val result = number
    var cycle = 0

    while (true) {
        cycle += 1
        number = ((number % 10) * 10) + ( ((number %10) + (number/10)) % 10)
        if (number == result) break
    }
    writer.write(cycle.toString())

    close()
    writer.flush()
    writer.close()
}

