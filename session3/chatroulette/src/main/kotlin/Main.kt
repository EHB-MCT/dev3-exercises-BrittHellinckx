fun main(){
    val persons = arrayOf(Student("Britt"),Comedian("Liese") ,Teacher("Bert"), Chatbot("Bottie"))

    val person = persons.random()
    person.introduce()
    person.chat()

    /*
    Eigen code
    val random = persons.random()
    random.introduce()
    when(random){
        is Student -> random.gossip()
        is Comedian -> random.joke()
        is Teacher -> random.fact()
        is Chatbot -> random.chat()
    }
    */

}