fun main(){
    //1.Logical OR ||  // one true=true
    //2.Logical AND && // both true=true
    //3.Logical NOT ! // true=false


    //1. Logical OR

    val a=6

    if (a>0 || a<5){
        println("A is greater than 0 and less than 5")
    }
    else{
        println("A is greater than 5")
    }

    // 2.Logical AND

    val b=6
    if (b>0 && b<5){
        println("B is greate than 0 and less than 5")
    }
    else{
        println("B is greater than 5")
    }

    // Logical NOT

    val x=10

    if (!(x%2==0)){
        println("$x is even number")
    }
    else{
        println("$x is odd number")
    }
}