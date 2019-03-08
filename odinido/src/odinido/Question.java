package odinido;

public abstract class Question {
    private int amountOfPoints;
    private String question;
    private String givenAnswer;

    public abstract void showQuestionAndGetInput();
    
    public abstract boolean checkGivenAnswer();

    public void setAmountOfPoints(int points) {
        this.amountOfPoints = points;
    }

    public int getAmountOfPoints() {
        return this.amountOfPoints;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setGivenAnswer(String givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    public String getGivenAnswer() {
        return this.givenAnswer;
    }
}
