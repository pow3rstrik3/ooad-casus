package odinido;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Question q1 = new MultipleChoice();
		q1.setAmountOfPoints(10);
		q1.setQuestion("Test\n");

		q1.showQuestionAndGetInput();
		
		ArrayList<String> correctAnswers = new ArrayList<String>();
		
		correctAnswers.add("10");
		correctAnswers.add("9");
		correctAnswers.add("8");
		correctAnswers.add("7");
		correctAnswers.add("6");
		
		Question q2 = new ShortAnswerQuestion(correctAnswers, "Welk cijfer krijgt ons project?");
		
		q2.showQuestionAndGetInput();
		
	}

}
