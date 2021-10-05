fun main(){
    var options = arrayOf("rock", "paper", "scissors")
    var optionsPc = options[(0..2).random()]
    var userInput = readLine()

    println("$optionsPc")

    if(userInput== "rock"){
        when (optionsPc){
            "rock" -> println("Draw: Computer chose $optionsPc")
            "paper" ->println("You lose: Computer chose $optionsPc")
            "scissors"->println("You win: Computer chose $optionsPc")
        }
    }
    if(userInput== "paper"){
        when (optionsPc){
            "paper" -> println("Draw: Computer chose $optionsPc")
            "scissors" ->println("You lose: Computer chose $optionsPc")
            "rock"->println("You win: Computer chose $optionsPc")
        }
    }
    if(userInput== "scissors"){
        when (optionsPc){
            "scissors" -> println("Draw: Computer chose $optionsPc")
            "rock" ->println("You lose: Computer chose $optionsPc")
            "paper"->println("You win: Computer chose $optionsPc")
        }
    }
}