open class Person(open val name: String) {
    open fun introduce() {
        println("Hello! I'm $name")
    }
}
