package com.example.finalproject

object Constants{


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "Which player is it",
            R.drawable.kante,
            "Boateng",
            "Alaba",
            "Kante",
            "Mendy",
            3
            )

        questionsList.add(que1)

        //question 2

        val que2 = Question(2, "Which player is it",
            R.drawable.alaba,
            "Lahm",
            "Ramos",
            "Alaba",
            "Hummels",
            3
        )

        questionsList.add(que2)

        //question3

        val que3 = Question(3, "Which player is it",
            R.drawable.torres,
            "Villa",
            "Torres",
            "Puyol",
            "Nedved",
            2
        )

        questionsList.add(que3)

        //question4

        val que4 = Question(4, "Which player is it",
            R.drawable.arnold,
            "Arnold",
            "Thiago Silva",
            "Pepe",
            "Gunter",
            1
        )

        questionsList.add(que4)

        //question 5

        val que5 = Question(5, "Which player is it",
            R.drawable.villa,
            "Di Maria",
            "Muller",
            "Villa",
            "Messi",
            3
        )

        questionsList.add(que5)

        //question 6

        val que6 = Question(6, "Which player is it",
            R.drawable.hart,
            "Joe Hart",
            "Neuer",
            "Reina",
            "Julio Cesar",
            1
        )

        questionsList.add(que6)

        //question7

        val que7 = Question(7, "Which player is it",
            R.drawable.kankava,
            "Ananidze",
            "Kankava",
            "Gotze",
            "Okriashvili",
            2
        )

        questionsList.add(que7)

        //question8

        val que8 = Question(8, "Which player is it",
            R.drawable.delpiero,
            "Zanetti",
            "Giggs",
            "Nedved",
            "Del Piero",
            4
        )

        questionsList.add(que8)

        //question9

        val que9 = Question(9, "Which player is it",
            R.drawable.kobi,
            "Kvaractskhelia",
            "Sichinava",
            "Kobiashvili",
            "Arveladze",
            3
        )

        questionsList.add(que9)

        //question 10

        val que10 = Question(10, "Which player is it",
            R.drawable.dudek,
            "Dudek",
            "Yashin",
            "Schmeichel",
            "Kahn",
            1
        )

        questionsList.add(que10)


        return questionsList
    }
}