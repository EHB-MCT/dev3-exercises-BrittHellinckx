class Duolingo {
        val words = mutableListOf<Word>(Word("cat", "kat", "en"),
                                        Word("chat", "kat", "fr"),
                                        Word("bunny", "konijn", "en"),
                                        Word("lapin", "konijn", "fr"),
                                        Word("dog", "hond", "en"),
                                        Word("chien", "hond", "fr"),
                                        Word("fish", "vis", "en"),
                                        Word("poisson", "vis", "fr"),
                                        Word("horse", "paard", "en"),
                                        Word("cheval", "paard", "fr"),
                                        Word("goat", "geit", "en"),
                                        Word("chevre", "geit", "fr"),
                                        Word("chicken", "kip", "en"),
                                        Word("poulet", "kip", "fr"),
                                        Word("mouse", "muis", "en"),
                                        Word("souris", "muis", "fr"),
                                        Word("donkey", "ezel", "en"),
                                        Word("ane", "ezel", "fr"),
                                        Word("snake", "slang", "en"),
                                        Word("serpent", "slang", "fr"))

    fun play(){
        //words.shuffle();
        val randomWords = words.shuffled().take(5).toMutableSet();

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