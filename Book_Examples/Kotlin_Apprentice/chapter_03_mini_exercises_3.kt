// Chapter 3: Types & Operations page 68
fun main() {
    /* ---------------------------------------------
        1.
        Declare a constant Triple that contains three Int values. Use this to represent a date (month, day, year).
    */

    val date = Triple(8, 10, 1972)

    /* ---------------------------------------------
        2.
        Extract the values in the triple into three constants named month, day and year.
    */

    val month   = date.first
    val day     = date.second
    val year    = date.third
    println("$year.${String.format("%02d", month)}.${String.format("%02d", day)}")

    /* ---------------------------------------------
        3.
        In one line, read the month and year values into two constants. You’ll need to employ the underscore to
        ignore the day.
    */

    val (m1, _, y1) = date

    /* ---------------------------------------------
        4.
        Since the values inside Pairs and Triples cannot be modified, you will need to extract the values from them,
        make any modifications you want, and then create a new Pair or Triple.
        Using the values you extracted in step three, modify the month value and create a new Pair containing the
        modified month along with the unmodified year.
    */

    val m2 = m1 + 1
    val date2 = m2 to y1
    println(date2)
}
