package odinido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChoice extends Question {

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
}
