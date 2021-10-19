class Comedian (override val name:String): Person(name), ChatPartner{
    override fun chat(){
        joke()
    }
    fun joke(){
        println("~insert funny joke~")
    }
}