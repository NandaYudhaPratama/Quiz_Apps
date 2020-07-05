package com.example.quizapps;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Benda hidup dinamakan...",
            "2. Berikut ini ciri-ciri benda hidup adalah...",
            "3. Manusia mendapatkan tenaga dari?",
            "4. Rasa haus akan hilang dengan cara?",
            "5. Mahluk hidup berkembang biak untuk menghasilkan?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Hewan", "Mahluk Hidup", "Manusia", "Tumbuhan"},
            {"Tidak Butuh Makan", "Dapat Tumbuh", "Tidak Bernafas", "Sekarat"},
            {"Makanan", "Orang Lain", "Orang Tua", "Penyakit"},
            {"Tidur", "Puasa", "Makan", "Minum"},
            {"Uang", "Rumah", "Keturunan", "Pasangan"}
    };

    private String mCorrectAnswers[] = {"Mahluk Hidup", "Dapat Tumbuh", "Makanan", "Minum", "Keturunan"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}