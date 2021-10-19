class Student (override val name:String): Person(name){
    fun gossip(){
        println("Oh my gosh, do you wanna know what I just heard!?")
    }
}