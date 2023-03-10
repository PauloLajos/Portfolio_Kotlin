// Chapter 3: Types & Operations page 66
fun main() {
    /* ---------------------------------------------
        1.
        Create a string constant called firstName and initialize it to your first name.
        Also create a string constant called lastName and initialize it to your last name.
    */

    val firstName = "Lajos"
    val lastName  = "Paulo"

    /* ---------------------------------------------
        2.
        Create a string constant called fullName by adding the firstName and lastName constants together,
        separated by a space.
    */

    val fullName = "$firstName $lastName"

    /* ---------------------------------------------
        3.
        Using string templates, create a string constant called myDetails that uses the fullName constant
        to create a string introducing yourself.
        For example, my string would read: "Hello, my name is Dick Lucas.".
    */

    val myDetails = "Hello, my name is $fullName."
    println(myDetails)
}
