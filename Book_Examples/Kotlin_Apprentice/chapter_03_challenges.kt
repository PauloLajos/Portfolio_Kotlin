fun main() {
    /* ---------------------------------------------
        1.
        Create a constant called coordinates and assign a pair containing two and three to it.
     */

    val coordinates = 2 to 3

    /* ---------------------------------------------
        2.
        Extract the values 2 and 3 from coordinates into two variables called row and column.
     */

    // hotfix ......................
    // val row = coordinates.first
    // val column = coordinates.second
    val (row, column) = coordinates
    println("row: $row, column: $column")

    /* ---------------------------------------------
        3.
        Which of the following are valid statements?
            val character: Character = "Dog"
            val character: Char = 'd'
            val string: String = "Dog"
            val string: String = 'd'
     */

    // val character: Character = "Dog"     - "Dog": String
    val character: Char = 'd'
    println(character)
    val string: String = "Dog"
    println(string)
    //val string: String = 'd'              - 'd': Char

    /* ---------------------------------------------
        4.
        Is this valid code?
            val date = Triple(15, 8, 2015)
            val day = date.First
     */
    val date = Triple(15, 8, 2015)
    // val day = date.First                             - date.first
    val day = date.first
    println(day)

    /* ---------------------------------------------
        5.
        What is wrong with the following code?
            val name = "Dick"
            name += " Lucas"
     */

    // val name = "Dick"
    // name += " Lucas"         - name is constant
    var name = "Dick"
    name += " Lucas"

    /* ---------------------------------------------
        6.
        What is the type of the constant named value?
            val triple = Triple(100, 1.5, 10)
            val value = triple.second
     */

    val triple = Triple(100, 1.5, 10)
    val value = triple.second                           // value type is Double
    println(value)

    /* ---------------------------------------------
        7.
        What is the value of the constant named month?
            val newDate = Triple(15, 8, 2015)
            val month = newDate.second
     */

    val newDate = Triple(15, 8, 2015)
    val month = newDate.second                           // month type is Int
    println(month)

    /* ---------------------------------------------
        8.
        What is the value of the constant named summary?
            val number = 10
            val multiplier = 5
            val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
     */

    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
    // summary: String
    println(summary)

    /* ---------------------------------------------
        9.
        What is the sum of a and b , minus c ? What is its type?
            val a = 4
            val b: Short = 100
            val c: Byte = 12
     */

    val a = 4
    val b: Short = 100
    val c: Byte = 12
    val sum = a + b - c
    println(sum)
    // sum: Int = 92

    /* ---------------------------------------------
        10.
        What is the numeric difference between kotlin.math.PI and kotlin.math.PI.toFloat()?
     */

    println(kotlin.math.PI)                 // Double = 3.141592653589793
    println(kotlin.math.PI.toFloat())       // Float = 3.1415927

}
