package odinido;

public class Main {

	public static void main(String[] args) {
		Question q1 = new MultipleChoice();
		q1.setAmountOfPoints(10);
		q1.setQuestion("Test\n");

		q1.showQuestionAndGetInput();

	}

}
