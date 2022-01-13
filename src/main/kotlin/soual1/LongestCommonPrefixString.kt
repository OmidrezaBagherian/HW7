package soual1

fun longestCommonPrefix(words: Array<String>): CharSequence {
    val size = words.size
    if (size == 0) return "There is no common prefix among the input strings"
    if (size == 1) return words[0]
    words.sort()
    val end = words[0].length.coerceAtMost(words[size - 1].length)
    var i = 0
    while (i < end && words[0][i] == words[size - 1][i]) i++
    return words[0].subSequence(0, i)
}

fun main() {
    val input = arrayOf("Omid", "Omidreza", "OmidX", "OmidV")
    println(longestCommonPrefix(input))
}

