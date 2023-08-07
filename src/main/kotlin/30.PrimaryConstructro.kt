class Bank1(private var name: String, private var branch: String, private var account: Int) // Primary Constructor variable
{
         fun  openAccount(){
             println("Open account")
             println("Bank name=$name")
             println("Branch name=$branch")
             println("Account number=$account")
         }
        fun  closeAccount(){
            println("Close account")
            println("Bank name=$name")
            println("Branch name=$branch")
            println("Account number=$account")
        }

}

//Main class

fun main(){
    val obj1Bank1= Bank1("SBI","India",2762637) // Object of bank class

    obj1Bank1.openAccount()
    obj1Bank1.closeAccount()

    val obj2Bank1= Bank1("BOI","India",87482783)

    obj2Bank1.closeAccount()

}