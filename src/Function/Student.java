package Function;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public boolean isAnswerCorrect(int correctAnswer, int userAnswer) {
        if(correctAnswer == userAnswer) {
            score++;
            return true;
        }
        else {
            return false;
        }
    }
}
