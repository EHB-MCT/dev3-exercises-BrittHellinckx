class Student (override val name:String): Person(name){
    fun gossip(){
        println("talk about someone else")
    }
}