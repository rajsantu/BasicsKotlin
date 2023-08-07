fun main(){

    functionName1()// Calling function 1
    functionName2()// Calling function 2
   println( functionWithArgument1(5))// Calling functionWithArgument1
   println(functionWithArgument2(5)) // Calling functionWithArgument2

}

fun functionName1(): Unit // Here is (Unit) return type function
{
    println("This is function-1")
}


// Also can write like this
fun functionName2()= println("This is function-2")


fun functionWithArgument1(a: Int): Int //Here (a:Int argument of function) and :Int return type of function
{
    return a * 5
}
// Also can write like this
fun functionWithArgument2(b:Int)=b*5


