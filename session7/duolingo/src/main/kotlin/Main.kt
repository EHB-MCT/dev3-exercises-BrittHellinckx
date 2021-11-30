fun main(){
    println("Choose your round size: 5 - 10 - 15")
    val userSize = readLine()!!.toInt();
    println("Choose your language: en - fr")
    val userLanguage = readLine()!!.toString();

    val duo = Duolingo(userSize, userLanguage);
    duo.play();
}