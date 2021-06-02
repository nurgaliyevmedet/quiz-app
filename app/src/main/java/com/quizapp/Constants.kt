package com.quizapp

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Who is it?",
            R.drawable._artist,
            "Artist", "Arter",
            "Paint", "Easel", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is it?",
            R.drawable._brushes,
            "Painters", "Paintists",
            "Brushes", "Crayons", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is it?",
            R.drawable._canvas,
            "Paint", "Paper",
            "Tissue", "Canvas", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is it?",
            R.drawable._collage,
            "Paint", "Collage",
            "Image", "Drawing", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is it?",
            R.drawable._crayons,
            "Brushes", "Watercolor",
            "Crayons", "Markers", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is it?",
            R.drawable._easel,
            "Easel", "Canvas",
            "Board", "None of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is it?",
            R.drawable._paint,
            "Image", "Collage",
            "Paint", "None of these", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is it?",
            R.drawable._palette,
            "Aquarelle", "Easel",
            "Watercolor", "Palette", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is it?",
            R.drawable._protractor,
            "Ruler", "Protractor",
            "Easel", "Crayons", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is it?",
            R.drawable._ruler,
            "Ruler", "Protractor",
            "Canvas", "Easel", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}