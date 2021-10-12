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
    println("Now it's time to go to school, choose you way of transportation")
    println("on foot - by bike - with the train")

    val userInput = readLine()

    when userInput{
        "on foot"->{
            printlin("Oh no, you don't have enough energy, go back and drink some more coffee")
            challengeTwo()
            }
        "by bike"-> challengeFour()
        "with the train"->{
            println("That wasn't very smart... Of course there are train delays and so you misses school")
            gameOver()
            }
    }
}
val pcGuess = (1..100).random()
fun challengeFour(){
    println("Yay! You made it on time. Now quickly, where do you need to be?")
    println("Choose a classroom between 1 and 100")

    val userInput = readLine ()

    if (userInput == pcGuess){
        challengeFive()
    }else if(userInput<pcGuess){
        println("Akward, you entered the wrong classroom. Your classroom is further down the hall")
        challengeFour()
    }else if(userInput> pcGuess){
        println("Akward, you entered the wrong classroom. You already passed your classroom")
        challengeFour()
    }
}
fun challengeFive(){
    println("You picked the right one, now time for class")

    //listen/silent
    //study/dusty
    //learn/renal
    //read/dear
}
