import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    /* ---------------------------------------------
        1.
        Declare a constant exercises with value 9 and a variable exercisesSolved with value 0.
        Increment this variable every time you solve an exercise (including this one).
    */
    val exercises = 9
    var exercisesSolved = 0

    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        2.
        Given the following code:
            age = 16
            print(age)
            age = 30
            print(age)
        Declare age so that it compiles. Did you use var or val?
     */

    var age = 16    // var
    println(age)
    age = 30
    println(age)

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        3.
        Consider the following code:
            val a: Int = 46
            val b: Int = 10
        Work out what answer equals when you replace the final line of code above with each of these options:
            // 1
            val answer1: Int = (a * 100) + b
            // 2
            val answer2: Int = (a * 100) + (b * 100)
            // 3
            val answer3: Int = (a * 100) + (b / 10)
     */

    val a: Int = 46
    val b: Int = 10

    // 1
    val answer1: Int = (a * 100) + b            // 46 * 100 = 4600 + 10 = 4610
    println("answer1 = $answer1")
    // 2
    val answer2: Int = (a * 100) + (b * 100)    // 46 * 100 = 4600, 10 * 100 = 1000, 4600 + 1000 = 5600
    println("answer2 = $answer2")
    // 3
    val answer3: Int = (a * 100) + (b / 10)     // 46 * 100 = 4600, 10 / 10 = 1, 4600 + 1 = 4601
    println("answer3 = $answer3")

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        4.
        Add parentheses to the following calculation.
        The parentheses should show the order in which the operations are performed and
        should not alter the result of the calculation.
        5 * 3 - 4 / 2 * 2
     */

    println("5 * 3 - 4 / 2 * 2 = ${5 * 3 - 4 / 2 * 2}")
    println("(5 * 3) - (4 / 2 * 2) = ${(5 * 3) - (4 / 2 * 2)}")

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        5.
        Declare two constants a and b of type Double and assign both a value.
        Calculate the average of a and b and store the result in a constant named average.
     */

     val a5: Double = 11.0
     val b5: Double = 36.0
     val average = (a5 + b5) / 2

    println("average: $average")

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        6.
        A temperature expressed in °C can be converted to °F by multiplying by 1.8 then incrementing by 32.
        In this challenge, do the reverse: convert a temperature from °F to °C.
        Declare a constant named fahrenheit of type Double and assign it a value.
        Calculate the corresponding temperature in °C and store the result in a constant named celcius.
     */

    val fahrenheit: Double = 100.0
    val celcius = (fahrenheit - 32) / 9 * 5     // C to F: C / 1.8 + 32, F to C: (F - 32) / 9 * 5

    println("$fahrenheit °F = ${String.format("%.1f", celcius)} °C")    // 100.0 °F = 37.8 °C

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        7.
        Suppose the squares on a chessboard are numbered left to right, top to bottom,
        with 0 being the top-left square and 63 being the bottom-right square.
        Rows are numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7.
        Declare a constant position and assign it a value between 0 and 63.
        Calculate the corresponding row and column numbers and store the results in constants named row and column.
     */

    val position = 22   // 0..63
    val row = position / 8
    val column = position % 8

    println("position: $position = $row row, $column column")

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        8.
        A circle is made up of 2𝜋 radians, corresponding with 360 degrees.
        Declare a constant degrees of type Double and assign it an initial value.
        Calculate the corresponding angle in radians and store the result in a constant named radians.
    */

    val degrees: Double = 57.33         // 1 rad = 180 / π
    val radians = 3.14 / 180 * degrees  // π / 180 * angle

    println("$degrees corresponding angle: ${String.format("%.2f", radians)} radians")

    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")

    /* ---------------------------------------------
        9.
        Declare four constants named x1 , y1 , x2 and y2 of type Double.
        These constants represent the two-dimensional coordinates of two points.
        Calculate the distance between these two points and store the result in a constant named distance.
    */

    val x1: Double = 1.0
    val y1: Double = 3.0
    val x2: Double = 8.0
    val y2: Double = 12.0
    val result = sqrt( (x2 - x1).pow(2) + (y2 - y1).pow(2) )

    println("the distance between these two points ($x1:$y1),($x2:$y2): ${String.format("%.2f", result)}")
    
    // Challenge 1.
    println("($exercises/${++exercisesSolved} exercises solved)\n")
}
