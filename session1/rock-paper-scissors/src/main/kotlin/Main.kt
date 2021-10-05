fun main(){
    var options = arrayOf("rock", "paper", "scissors")
    var optionsPc = options.random()
        //options[(0..2).random()]
    var userInput = readLine()

    println("You chose $userInput")
    println("Computer chose $optionsPc")

    if(userInput== "rock"){
        when (optionsPc){
            "rock" -> println("Draw")
            "paper" ->println("You lose")
            "scissors"->println("You win")
        }
    } else if(userInput== "paper"){
        when (optionsPc){
            "paper" -> println("Draw")
            "scissors" ->println("You lose")
            "rock"->println("You win")
        }
    } else if(userInput== "scissors"){
        when (optionsPc){
            "scissors" -> println("Draw")
            "rock" ->println("You lose")
            "paper"->println("You win")
        }
    }else{
        println("Invalid option")
    }
}