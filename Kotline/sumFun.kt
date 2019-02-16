
fun main(args:Array<String>){
    val a = 1
    val b = 2
    val c = sum(a, b) 
    printSum(a,b)
    println(c)
}

fun sum(a: Int, b: Int) = a + b
fun printSum(a: Int, b: Int):Unit{
    println("sum of $a and $b is ${a + b}")
}