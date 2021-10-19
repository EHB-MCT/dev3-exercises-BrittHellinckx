class Chatbot(val name: String): ChatPartner{
    override fun introduce(){
        println("Hello! I'm $name")
    }
    override fun chat(){
        println("Beep beep ~ERROR~")
    }
}