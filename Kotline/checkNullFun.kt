fun parseInt(str: String): Int ?{
    return str.toIntOrNull()
}
fun main(args:Array<String>){
    val arg1 = "1"
    val arg2 = "2a"
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null){
        println(x*y)
    }
    else{
        println("either '$arg1' or '$arg2' is not a number")
        }
    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}