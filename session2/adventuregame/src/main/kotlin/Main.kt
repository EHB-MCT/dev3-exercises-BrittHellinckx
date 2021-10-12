fun main(){
    println("Ready to start your day?")
    challengeOne()
}
fun gameOver(){
    println("Ready to try again?")
}
fun challengeOne(){
    println("It's 6am and your alarm clock is ringing")
    println("How many times are you going to snooze?")

    val snoozes= setOf<String>("none","once","twice")
    val userInput = readLine()

    if(snoozes.contains(userInput)){
        println("Congrats you woke up, now continue")
        challengeTwo()
    }else{
        println("You fell asleep again and missed school")
        gameOver()
    }
}

fun challengeTwo(){

}