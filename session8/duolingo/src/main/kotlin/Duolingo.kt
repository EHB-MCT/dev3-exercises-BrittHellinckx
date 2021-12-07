class Duolingo (val lan: String){
        val words = mutableListOf<Word>(
            EnglishWord("cat", "kat"),
            FrenchWord("chat", "kat"),
            EnglishWord("bunny", "konijn"),
            FrenchWord("lapin", "konijn"),
            EnglishWord("dog", "hond"),
            FrenchWord("chien", "hond"),
            EnglishWord("fish", "vis"),
            FrenchWord("poisson", "vis"),
            EnglishWord("horse", "paard"),
            FrenchWord("cheval", "paard"),
            EnglishWord("goat", "geit"),
            FrenchWord("chevre", "geit"),
            EnglishWord("chicken", "kip"),
            FrenchWord("poulet", "kip"),
            EnglishWord("mouse", "muis"),
            FrenchWord("souris", "muis"),
            EnglishWord("donkey", "ezel"),
            FrenchWord("ane", "ezel"),
            EnglishWord("snake", "slang"),
            FrenchWord("serpent", "slang")
        )
    init{
        println("Choose your round difficulty: easy - hard")
        var diff = readLine()!!.toString();
        var size = 0;
        if(diff =="easy"){
            size = 5;
        }else if (diff == "hard"){
            size = 10;
        }else{
            throw Exception("Please provide a valid difficulty")
            main();
        }
        var randomWords = words.shuffled().filter{it.language == lan}.take(size).toMutableList();
        play(randomWords)
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