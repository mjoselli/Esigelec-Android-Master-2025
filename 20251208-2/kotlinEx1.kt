fun main() {
    println("Hello, Esigelec!!!")
    val name = "Kotlin" 
    //name = "Java" 
    // E r r o r ! 
    val  pi = 3.1415
    
    var score = 10
    score = 20
	var isActive = false
    isActive = true
    val language = "french" // string
    val year = 2025 //int
	val PI:Double = 3.14
    
    println("Year is $year")
    println("2 times pi is ${PI * 2}")
    val sequence = 2 + (pi * (pi / 35)) - 3; val newVal = 35
    println("add 2 + 2 = ${add(2,2)}")
    println("add 2 + 2 = ${add(a=2,b=2)}")
    println("add 2 + 2 = ${add(b=2,a=2)}")
    println("add 2 * 4 = ${multiply(2,4)}")
    greet("Mark")
    greet("Mark", "Hi")
    if(year == 2025){
        println("currently year")
    }else if(year == 2024){
        println("last year")
    }else {
        println("not this year")
    }
    val isEven = if(year%2 == 0) "Yes" else "No" 
    val x = 3
    when( x ){ 
        1 -> print(" x is 1 " ) 
        2 -> print("x is 2" ) 
        in 3..10 -> print ("x is 3-10")
        else -> print("s is unknow")
    }
    for (i in 1..5 ){ println(i) } 
    val itens = mutableListOf("banana","apple","peach")
    for(item in itens){println(itens)}
    val mark = Person("Mark",44)
    mark.printData()
    mark.age = 33
    val teacher = PersonWithJob("Mark",44,"teacher")
}
open class Person(val name: String, var age: Int){
    fun printData(){
        println("$name born in ${bornYear()}")
    }
    fun bornYear(): Int{
        return 2025 - age
    }
}
class PersonWithJob(name: String,age: Int, val job: String) : Person(name, age)
fun add(a:Int, b:Int):Int {
    return a + b
}
fun multiply(a:Int, b:Int):Int = a * b
fun greet(name: String, prefix:String = "Hello") = println("$prefix, $name")
