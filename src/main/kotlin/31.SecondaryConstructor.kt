data class Bank2(var name: String,  var branch: String,var account: Int) // Primary Constructor variable
{
    private var bankType: String?=null
    private var accountType: String?=null
    constructor(name: String, branch: String, account: Int, bankType:String, accountType:String): this( name, branch, account){
        this.bankType=bankType
        this.accountType=accountType
    }

    fun  openAccount(){
        println("Open account")
        println("Bank type=$bankType")
        println("Account type=$accountType")
        println("Bank name=$name")
        println("Branch name=$branch")
        println("Account number=$account")
    }
    fun  closeAccount(){
        println("Close account")
        println("Bank type=$bankType")
        println("Account type=$accountType")
        println("Bank name=$name")
        println("Branch name=$branch")
        println("Account number=$account")
    }

}

//Main class

fun main(){
    val obj1Bank2= Bank2("SBI","India",2762637) // Object of bank class

    obj1Bank2.openAccount()

    val obj2Bank2=Bank2("Axis","India",87482783,"Private","Saving account")

    obj2Bank2.closeAccount()

}