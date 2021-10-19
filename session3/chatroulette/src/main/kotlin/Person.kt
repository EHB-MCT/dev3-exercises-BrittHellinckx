open class Person(open val name: String) {
    open fun introduce() {
        println("hello! I'm $name")
    }
}
