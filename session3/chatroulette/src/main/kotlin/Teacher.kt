class Teacher (override val name:String): Person(name), ChatPartner {
    override fun chat(){
        fact()
    }
    fun fact(){
        println("When your head is chopped of you still live for some seconds")
    }
}