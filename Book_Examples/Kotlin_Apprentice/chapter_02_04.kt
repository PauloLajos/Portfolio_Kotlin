/*
    4.
    Create a variable called answer and initialize it with the value 0.
    Increment it by 1.
    Add 10 to it.
    Multiply it by 10.
    Then, shift it to the right by 3.
    After all of these operations, what’s the answer?
 */

fun main(): Unit {
    var answer = 0
    answer += 1
    answer += 10
    answer /= 10
    answer shr 3

    println(answer)
}