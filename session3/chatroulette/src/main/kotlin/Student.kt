class Student (override val name:String): Person(name), ChatPartner{
    override fun chat(){
        gossip()
    }
    fun gossip(){
        println("Oh my gosh, do you wanna know what I just heard!?")
    }
}