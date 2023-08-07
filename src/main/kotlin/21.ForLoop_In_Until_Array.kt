fun main(){
    val a = arrayOf("a","b","c","d")
    for (i in 0..a.size -1){
        println("${a[i]}")
    }

    val b = arrayOf("a","b","c","d")

    for (j in 0 until a.size){
        println("${a[j]}")
    }
}