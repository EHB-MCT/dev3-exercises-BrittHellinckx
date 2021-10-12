fun main(){
    println("Ready to start your day?")
    challengeOne()
}
fun gameOver(){
    println("Ready to try again?")
    main()
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
    println("Now time for breakfast, how many cups of coffee are you going to drink?")
    println("Are you going to choose little coffee (1-3 cups) or a lot of coffee (4-6 cups)?")
    val pcRandom = (0..6).random()
    val userInput = readLine()

    if(pcRandom<=3){
        when(userInput){
        "little coffee"-> challengeThree()
        "a lot of coffee"->{
            println("You drank too much coffee and can't focus on school")
            gameOver()
            }
        }
    }else if(pcRandom == 4){
        when(userInput){
        "a lot of coffee" -> challengeThree()
        "little coffee"->{
            println("You drank too little coffee and fell asleep again")
            gameOver()
            }
        }
    }
}
fun challengeThree(){
    println("Perfect amount of coffee")

}