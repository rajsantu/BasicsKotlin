class ClassAndObject {
        private var intValue: Int = 25
        private var floatValue: Float = 34.56F
        private var stringValue: String ="Class"

        fun funOneOfClass(){
            println("$intValue  int value of function 1 in the class")
        }
        fun funTwoClass(){
            println("$floatValue float value of function 2 in the class")

        }
        fun funThreeOfClass(){
            println("$stringValue string value of function 3 in the class")
        }

    }

    fun main(){
        val objects= ClassAndObject ()
        objects.funOneOfClass()
        objects.funTwoClass()
        objects.funThreeOfClass()
    }
