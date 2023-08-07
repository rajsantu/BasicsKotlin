fun main(){
       val a=17

    when(a){
        in 1..10 -> print("$a Between 1 to 10")
        in 11..20 -> println("$a Between 11 to 20")
    else -> println("$a Non of the above range")
    }

}