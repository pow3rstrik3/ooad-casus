package odinido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortAnswerQuestion extends Question {
	public ArrayList<String> correctAnswers = new ArrayList<String>();
	
	public ShortAnswerQuestion(ArrayList<String> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	
	public void addCorrectAnswer(String correctAnswer) {
		correctAnswers.add(correctAnswer);
	}
	
	@Override
    public void showQuestionAndGetInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vraag: " + getQuestion());
        try {
            setGivenAnswer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getGivenAnswer());
    }

	@Override
	public boolean checkGivenAnswer(String answer) {
		for(String correctAnswer : correctAnswers) {
			if(answer.equals(answer)) {
				return true;
			}
		}
		return false;
	}
}
