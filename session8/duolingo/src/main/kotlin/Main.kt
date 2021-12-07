fun main(){
    println("Choose your language: en - fr")
    val userLanguage = readLine()!!.toString();
    val duo = Duolingo(userLanguage);
}