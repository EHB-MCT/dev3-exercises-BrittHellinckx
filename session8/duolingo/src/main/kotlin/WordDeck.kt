class WordDeck {
    val originalWords = mutableListOf<Word>(
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
    var words = originalWords
    fun filterByLanguage(lan:String){
        words = words.filter{it.language == lan}.toMutableList()
    }
    fun filterByDifficulty(){}
    fun reset(){
        words = originalWords
    }
}
