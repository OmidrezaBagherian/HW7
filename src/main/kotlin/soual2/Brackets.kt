package soual2

import java.util.*

fun bracketBalanced(example: String): Boolean {
    val stack: Deque<Char> = ArrayDeque()
    for (i in example.indices) {
        val x: Char = example[i]
        if (x == '(' || x == '[' || x == '{') {
            stack.push(x)
            continue
        }
        val check: Char
        when (x) {
            ')' -> {
                check = stack.pop()
                if (check == '{' || check == '[') return false
            }
            '}' -> {
                check = stack.pop()
                if (check == '(' || check == '[') return false
            }
            ']' -> {
                check = stack.pop()
                if (check == '(' || check == '{') return false
            }

        }
    }
    return stack.isEmpty()
}

fun main() {
    val example = "([{,}])"
    println(bracketBalanced(example))
}