fun main () {
    var x = ""
    var y = " "
    println(x.isEmpty())
    println(x.isBlank())
    println(y.isBlank())
    println(y.isEmpty())

    identity("Rosemary",23)


    var a = "Akirachix"
    var ab = a[0]
    var ac = a[2]
    var ad = a[3]
    var word = "$ab$ac$ad"
    println(word)
    statement("books,laptops,phones,pens,pencils,chargers,adapters,classes")
    triangle(0.5F,"b*h")


}
fun identity (name: String,age: Int): String{
    var day = "Hi my name is $name and I am $age years old."
    println(day)
    return day
}
fun statement (list: String ): String{
    var line = "The length of the string is " +list.length
    println(line)
    return line
}

fun triangle (a :Float,b: String): String{
    var math = "$a$b"
    print(math)
    return math
}





