class Duolingo (val lan: String){
    val wordDeck = WordDeck()
    init{
        println("Choose your round difficulty: easy - hard")
        val difficulty = readLine()!!.toString();
        var size = 0;
        if(difficulty =="easy"){
            size = 5;
        }else if (difficulty == "hard"){
            size = 10;
        }else{
            throw Exception("Please provide a valid difficulty")
        }
        wordDeck.filterByLanguage(lan)
        //val randomWords = words.shuffled().filter{it.language == lan}.take(size).toMutableList();
        play(wordDeck)
    }

    fun play(randomWords:MutableList<Word>){
        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
                //Question for user
                println("Vertaal " + selectedWord.original + " in het het Nederlands")
                val userInput = readLine()
                //User got answer correct
                if(userInput == selectedWord.translated){
                    //lowers diff
                    selectedWord.diff = selectedWord.diff - 1
                    //removes word
                    randomWords.remove(selectedWord);
                    println("Dat is juist! woord moeilijkheid is ${selectedWord.diff}")
                }
                //user got answer wrong
                else{
                    //ups diff
                    selectedWord.diff = selectedWord.diff + 2
                    println("Fout! De juiste vertaling is ${selectedWord.translated}, woord moeilijkheid is ${selectedWord.diff}")
                }
            //counts how many words to go
            when{
               randomWords.count()==0 -> println("Goed gedaan!")
                randomWords.count()>0 -> println("Nog " + randomWords.count())
            }
        }
    }
}