package soual3

fun maxSubArraySum(numbers: IntArray): Int {
    val size = numbers.size
    var maxNumIsFor = Int.MIN_VALUE
    var maxNumEnd = 0

    for (i in 0 until size) {
        maxNumEnd += numbers[i]
        if (maxNumIsFor < maxNumEnd) maxNumIsFor = maxNumEnd
        if (maxNumEnd < 0) maxNumEnd = 0
    }
    return maxNumIsFor
}

fun main() {
    val nums = intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)
    println(maxSubArraySum(nums))
}