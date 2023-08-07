fun main(){
    //Immutable list
    val listOfString = listOf("List","in","Kotlin","Immutable")
    println(listOfString)

    // Mutable list

    val listOfMutableString = mutableListOf("List","in","Kotlin","Immutable")
     // Replace

    listOfMutableString[3] ="Mutable"//String  Changed

    println(listOfMutableString)

    //Add

listOfMutableString.add(4,"String Add")
    println(listOfMutableString)

    //Remove

    listOfMutableString.removeAt(4)
    println(listOfMutableString)


    // Combine List

    val secondList = mutableListOf("Element","of","second","list")
    listOfMutableString.addAll(secondList)
    println(listOfMutableString)
    


}