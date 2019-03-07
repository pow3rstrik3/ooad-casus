package odinido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortAnswerQuestion extends Question {
	public ArrayList<String> correctAnswers = new ArrayList<>();
	
	public ShortAnswerQuestion() {
	}
	
	public void addCorrectAnswer(String correctAnswer) {
		correctAnswers.add(correctAnswer);
	}
	
	@Override
    public void showQuestionAndGetInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vraag: " + getQuestion() + "\n");
        try {
            setGivenAnswer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	@Override
	public boolean checkGivenAnswer() {
		for(String correctAnswer : correctAnswers) {
			if(getGivenAnswer().equals(correctAnswer)) {
				return true;
			}
		}
		return false;
	}
}
