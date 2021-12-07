fun main(){

    println("Choose your round size: 5 - 10")
    val userSize = readLine()!!.toInt();
    println("Choose your language: en - fr")
    val userLanguage = readLine()!!.toString();
    val duo = Duolingo(userSize, userLanguage);
    //duo.play();

    //choose lvl of lang
    //userchoice1 = readline
    //if user == lang -> choose size -> duoplay(userchoice1, size)
    //else duoplay(userchoice1)
}