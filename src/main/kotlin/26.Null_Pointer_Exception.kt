fun main(){
    // ? Null safety operator

    var nullValueString: String? = null

    println(nullValueString) // Default call

    println(nullValueString?.length)// ? Safe call

    // println(nullValueString!!.length)// !! non-null asserted call // unsafe call

   //  ?: Elvis operator

    println(nullValueString?.length ?: "Nothing found")


}