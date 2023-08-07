class Constructor {
         //Primary constructor
         //Secondary constructor

}
//Primary constructor

class Dog(var breed: String,var color: String,var age: Int)//Constructor variable
{
    /*This is non optimize

     Dog(breed: String, color: String, age: Int)//Constructor variable

    //init{this} call constructor variable

    var breed: String //Member Variable
    var color: String
    var age: Int

    init {  //Constructor variable call
        this.breed=breed
        this.color=color
        this.age=age
    }

    // Without init{this}

    var breed: String =breed // Join Member Variable with Constructor variable
    var color: String = color
    var age: Int= age
     */

    /* This is Optimize

 Dog(var breed: String,var color: String,var age: Int)//Constructor variable
     */

    fun eat(){
    println("$breed eat food")
    }
    fun bark(){
     println("$breed bark")

    }
    fun run(){
     println("$breed run")
    }
}

//Main class

fun main(){
    val dog1= Dog(breed = "German ", color = "Red Black", age = 9)
    dog1.bark()
    dog1.eat()
    dog1.run()


}