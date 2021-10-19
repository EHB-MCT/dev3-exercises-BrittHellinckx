fun main(){
    val britt = Student("Britt")
    val liese = Comedian("Liese")
    val bert = Teacher("Bert")

    val persons = arrayOf(britt, liese, bert)
    val random=persons.random()
    random.introduce()

    when(random){
        is Student-> random.gossip()
        is Comedian-> random.joke()
        is Teacher-> random.fact()
    }
}