package odinido;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<Question> questions;
    private int points;

    public List<Question> getQuestions() {
        return questions;
    }

    public void init() {
        questions = new ArrayList<Question>();

        MultipleChoice q1 = new MultipleChoice();
        q1.setQuestion("Welke van de begrippen needs, features en requirements horen bij het solution domain?");
        q1.setAmountOfPoints(10);
        q1.setCorrectAnswer("C");
        q1.addPotentialAnswer("A", "needs, features en requirements");
        q1.addPotentialAnswer("B", "needs en requirements");
        q1.addPotentialAnswer("C", "features en requirements");
        q1.addPotentialAnswer("D", "alleen requirements");
        questions.add(q1);

        MultipleChoice q2 = new MultipleChoice();
        q2.setQuestion("Wat wordt bedoeld met 'elicit needs from stakeholders'?");
        q2.setAmountOfPoints(25);
        q2.setCorrectAnswer("A");
        q2.addPotentialAnswer("A", "Het boven tafel krijgen van de needs van belanghebbenden");
        q2.addPotentialAnswer("B", "Het documenteren van de needs van belanghebbenden");
        q2.addPotentialAnswer("C", "Het valideren van de needs van belanghebbenden");
        q2.addPotentialAnswer("D", "Het vertalen van de needs van belanghebbenden naar software features");
        questions.add(q2);

        ShortAnswerQuestion q3 = new ShortAnswerQuestion();
        q3.setQuestion("Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'?");
        q3.setAmountOfPoints(15);
        q3.addCorrectAnswer("traceabolity");
        q3.addCorrectAnswer("tracebility");
        q3.addCorrectAnswer("traceabillity");
        q3.addCorrectAnswer("tracebillity");
        questions.add(q3);

        MultipleChoice q4 = new MultipleChoice();
        q4.setQuestion("In een project wordt gewerkt volges een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?");
        q4.setAmountOfPoints(20);
        q4.setCorrectAnswer("B");
        q4.addPotentialAnswer("A", "Op elk gewenst moment");
        q4.addPotentialAnswer("B", "Na elke iteratie");
        q4.addPotentialAnswer("C", "Niet meer, de requirements liggen vast");
        questions.add(q4);

        MultipleChoice q5 = new MultipleChoice();
        q5.setQuestion("In welke categorie (volgens FURPS) valt de volgende eis: \n R1. Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren.");
        q5.setAmountOfPoints(30);
        q5.setCorrectAnswer("D");
        q5.addPotentialAnswer("A", "Functionality");
        q5.addPotentialAnswer("B", "Usability");
        q5.addPotentialAnswer("C", "Reliability");
        q5.addPotentialAnswer("D", "Performance");
        q5.addPotentialAnswer("E", "Supportability");
        questions.add(q5);

        startTest();
    }

    public void startTest() {
        int i = 1;

        for (Question q : questions) {
            q.showQuestionAndGetInput();
        }

        for (Question q : questions) {
            if(q.checkGivenAnswer()) {
                System.out.println("Vraag " + Integer.toString(i) + ": Goed, " + q.getAmountOfPoints() + " punten verdiend.");
                points += q.getAmountOfPoints();
            } else {
                System.out.println("Vraag " + Integer.toString(i) + ": Fout.");
            }
            i++;
        }

        System.out.println("Behaalde punten: " + Integer.toString(points));
    }
}
