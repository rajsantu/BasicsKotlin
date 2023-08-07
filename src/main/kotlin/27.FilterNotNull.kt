fun main(){
     val nullList = listOf(1,2,null,7,null,8,3,null)
    println("List after null filter${nullList.filterNotNull()}")
}