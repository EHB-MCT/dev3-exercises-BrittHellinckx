class Duolingo (val size:Int, val lan: String){
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
        var randomWords = mutableListOf<Word>()
        when (lan) {
            "en" -> {
                randomWords = words.shuffled().filterIsInstance<EnglishWord>().take(size).toMutableList();
            }
            "fr" -> {
                randomWords = words.shuffled().filterIsInstance<FrenchWord>().take(size).toMutableList();
            }
            else -> {
                println("This language is not available")
            }
        }
        play(randomWords)
    }

    fun play(randomWords:MutableList<Word>){
        while(randomWords.isNotEmpty()){
            val selectedWord = randomWords.random()
                println("Vertaal " + selectedWord.original + " in het het Nederlands")
                val userInput = readLine()
                if(userInput == selectedWord.translated){
                    randomWords.remove(selectedWord);
                    println("Dat is juist!")
                }else{
                    println("Fout! De juiste vertaling is ${selectedWord.translated}")
                }
            when{
               randomWords.count()==0 -> println("Goed gedaan!")
                randomWords.count()>0 -> println("Nog " + randomWords.count())
            }
        }
    }
}