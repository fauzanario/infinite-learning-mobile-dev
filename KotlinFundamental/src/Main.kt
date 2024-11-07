//<Function>

fun helloWorld() {
    println("Hello World!")
    println("Infinite Learning")
}

//function parameter
fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

//function default parameter
fun sayHello2(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

//function named argument
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String,
) {
    println("Hi $firstName $middleName $lastName")
}

//fun main() {

//    helloWorld()

//    sayHello("Fauzan", "Ario")

//    sayHello2("Fauzan")
//    sayHello2("Fauzan", "Ario")

//    fullName(
//        firstName = "Fauzan",
//        middleName = "Ario",
//        lastName = "Bagaskoro"
//    )


//    <variable>

//    var company: String = "Infinite Learning"
//    //var can change the initial value
//    val company: String = "Infinite Learning"
//    //val cannot change the initial value that was previously initialized
//    company = "Nongsa Digital"
//
//    println(company)


//    <data type>

//    var grade = 'A'
//
//    println("Grade " + grade++)
//    println("Grade " + grade++)
//    println("Grade " + grade++)
//    println("")
//    println("Grade " + grade--)
//    println("Grade " + grade--)
//    println("Grade " + grade--)

//    val stringText = "Kotlin Language"
//    val firstChar = stringText[0]
//
//    println("First character of $stringText is $firstChar")

//    val stringText = "Kampus merdeka \nby \"Infinite Learning\""
//    println(stringText)

//    val statement = """
//    Belajar bahasa kotlin
//    ---------------------
//    Di Infinite Learning
//    bersama Kampus Merdeka
//    """.trimIndent()
//
//    println(statement)

//    var x = true
//    var y = false
//
//    println("x && y = " + (x && y)) // -> false
//    println("x || y = " + (x || y)) // -> true
//    println("!y = " + (!y)) // -> true

//    val x: Int = 50
//    val y: Int = 24
//
//    println("x > y = " + (x > y))
//    println("x < y = " + (x < y))
//    println("x >= y = " + (x >= y))
//    println("x <= y = " + (x <= y))
//    println("x == y = " + (x == y))
//    println("x != y = " + (x != y))

//    val a: Int = 10000
//    val d: Double = 100.00
//    val f: Float = 100.00f
//    val l: Long = 1000000004L
//    val s: Short = 10
//    val b: Byte = Byte.MAX_VALUE
//
//    println("Int Value is " + a)
//    println("Double Value is " + d)
//    println("Float Value is " + f)
//    println("Long Value is " + l)
//    println("Short Value is " + s)
//    println("Byte Value is " + b)

//    val groups = arrayOf<String>("Group 1","Group 2","Group 3","Group 4")
//
//    println(groups[0])
//    println(groups.get(1))
//    println("-------------------")
//
//    groups[0] = "Group Satu"
//    groups.set(1, "Group 2")
//
//    println(groups[0])
//    println(groups.get(1))
//    println(groups.get(2))

//    val intArray = intArrayOf(2, 9, 11, 15)
//    intArray[2] = 30
//
//    println(intArray[2])


//    <String Template>

//    val company = "Infinite Learning"
//    print("We are studying in " + company)
//    //without string template
//
//    val company = "Infinite Learning"
//    print("We are studying in $company")
//    //with string template

//    val score = 70
//    print("Results= ${ if (score >= 80) "You Win!" else "Try Again:\" " }")


//    <Nullable Types>

//    val text: String? = null

//    var string: String? = "Infinite Learning"
//    if (string != null) { // smart cast
//        println(string.length)

//    var obj: Any = "IL"
//
//    if(obj is String) {
//        // Tidak membutuhkan casting secara eksplisit
//        println("String length is ${obj.length}")

//    <Safe Calls and Elvis Operator>

//    val safeText: String? = null
//    val safeTextLength = safeText?.length ? : 0

//    var dateOut: String? = null
//    var status = "Booked"
//
//    status = "Checkout"
//
//    if (status.equals("Checkout")) {
//        dateOut = "18/03/2024 13:30:00"
//    }
//
//    println(dateOut)


//    <If Expressions>

//    val examScore = 100
//
//    if (examScore == 100) {
//        println('A')
//    } else if (examScore >= 80) {
//        println('B')
//    } else {
//        println('C')
//    }

//    <Lambda>

//    val length = nameLength("Fauzan Ario Bagaskoro")
//    println("Name Length $length")
//}
//
//val nameLength = {message: String -> message.length}

//fun calculation(x: Int, y: Int, operation: (Int, Int) -> Int) {
//    val result = operation(x, y)
//    println("Hasil: $result")
//}
//
//calculation(5, 3, { x, y -> x * y })}

//   <Higher Order Function>

//fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//    return operation(x, y)
//}
//
//fun add(x: Int, y: Int): Int {
//    return x + y
//}
//
//fun subtract(x: Int, y: Int): Int {
//    return x - y
//}
//
//fun main() {
//    val result1 = calculate(5, 3, ::add)
//    println(result1) // 8
//
//    val result2 = calculate(5, 3, ::subtract)
//    println(result2) // 2
//}

fun print(document: () -> String) {
    println(document())
}

fun documentWord(): String {
    return "This is a Word document."
}

fun documentPDF(): String {
    return "This is a PDF document."
}

fun main() {
    print(::documentWord)
    println() // This is a Word document.

    print(::documentPDF)
    println() // This is a PDF document.
}