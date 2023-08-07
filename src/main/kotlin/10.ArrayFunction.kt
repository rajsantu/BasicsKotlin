import com.sun.jdi.connect.Connector.StringArgument
import java.util.Arrays

fun main(){
     val stringArray: Array<String> = arrayOf("Array","Function","in","Kotlin")

    println(stringArray[2])// Value of index 2

    stringArray[2] = "New value"
    println(stringArray[2]) // New value of index 2

    println(stringArray.size)// Size of array

    println(stringArray.contentToString())// contentToString  use to print all string element of an array
}