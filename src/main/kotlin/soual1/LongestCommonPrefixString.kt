package soual1

fun longestCommonPrefix(words: MutableList<String>): CharSequence? {
    val size = words.size
    if (size == 0) return "Null"
    if (size == 1) return words[0]
    words.sort()
    val end = words[0].length.coerceAtMost(words[size - 1].length)
    var i = 0
    while (i < end && words[0][i] == words[size - 1][i]) i++
    return words[0].subSequence(0, i)
}

fun main() {
    val input = mutableListOf<String>("a1pp","1apple","app1lication")
    println(longestCommonPrefix(input))
}

