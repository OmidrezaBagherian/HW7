package soual4

fun fibonacci(num: Int): Int {
    if (num <= 1) return num
    return fibonacci(num - 1) + fibonacci(num - 2)
}

fun countWays(sThStair: Int) = fibonacci(sThStair + 1)

fun main() {
    val sTh = 4
    fibonacci(sTh)
    println(countWays(sTh))
}