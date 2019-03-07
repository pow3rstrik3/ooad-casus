package odinido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question {

    private Map<String, String> potentialAnswers;
    private String correctAnswer;

    public MultipleChoice() {
        this.potentialAnswers = new HashMap();
    }

    @Override
    public void showQuestionAndGetInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vraag: " + getQuestion() + "\n");
        potentialAnswers.forEach((k, v) -> System.out.print(k + ". " + v + "\n"));
        try {
            setGivenAnswer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkGivenAnswer() {
            if(getGivenAnswer().equals(correctAnswer)) {
                return true;
            }
        return false;
    }

    public Map getPotentialAnswers() {
        return potentialAnswers;
    }

    public void addPotentialAnswer(String key, String potentialAnswer) {
        this.potentialAnswers.put(key, potentialAnswer);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
