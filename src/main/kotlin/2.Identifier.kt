fun main(){
    // Identifier use to represent the type of variable or value
    // keyword identifier    datatype

    // var

    println("This is var")
    var integerVariable=10
    var floatingPointVariable=25.34
    var stringVariable="This is string "
    var characterVariable='c'
    var booleanVariable=false

    // var can change same type of data
    // it can not change one type of data to another
    integerVariable=25
    floatingPointVariable=10.23
    stringVariable="Changed string"
    characterVariable='D'
    booleanVariable=true


    println(integerVariable)
    println(floatingPointVariable)
    println(stringVariable)
    println(characterVariable)
    println(booleanVariable)

    //val
    println("This is val")

    val integerValue=10
    val floatingPointValue=25.34
    val stringValue="This is string "
    val characterValue='c'
    val booleanValue=false

    println(integerValue)
    println(floatingPointValue)
    println(stringValue)
    println(characterValue)
    println(booleanValue)

    //     integerValue=12 //Compilation error occur


}