fun main(){
    val britt = Student("Britt")
    val liese = Comedian("Liese")
    val bert = Teacher("Bert")
    val bot = Chatbot("Bottie")

    val persons = arrayListOf(britt, liese, bert, bot)

    var random=persons.random()
    random.introduce()
    when(random){
        is Student -> random.gossip()
        is Comedian -> random.joke()
        is Teacher -> random.fact()
        is Chatbot -> random.chat()
    }

    random=persons.random()
    random.introduce()
    when(random){
        is Student -> random.gossip()
        is Comedian -> random.joke()
        is Teacher -> random.fact()
        is Chatbot -> random.chat()
    }
}