fun main(){
    val britt = Person("Britt")
    val liese = Person("Liese")

    val persons = arrayOf(britt, liese)

    persons.random().introduce()
}