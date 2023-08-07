fun main(){
    val a= arrayOf(1,2,3,4)
    try{
        a[4]=8
        println("Try")
    }
    catch (e: ArrayIndexOutOfBoundsException){
        println("Catch")
    }
    finally {
        println(a[3])
    }

}