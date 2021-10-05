fun main(){
    var names = arrayOf("Britt", "Liese", "Rebecca", "Arno", "Hannelore")
    for (name in names){
        printName(name)
    }
}
fun printName(name: String){
    println("Hello $name")
}