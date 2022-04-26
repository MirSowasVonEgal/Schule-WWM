package me.mirsowasvonegal.wwm.models;

import me.mirsowasvonegal.wwm.gui.GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    private ArrayList<Question> questions = new ArrayList<>();
    private Random random = new Random();

    public Game() {
        importQuestions();
    }

    public Question getRandomQuestion() {
        if(questions.size() == 0) {
            JOptionPane.showMessageDialog(null, "Du hast alle Fragen beantwortet!");
            return null;
        }
        Question question = questions.get(random.nextInt(questions.size()));
        questions.remove(question);
        return question;
    }

    private void importQuestions() {
        questions.add(new Question("Frage 1",
                new Answer("Antwort 1"),
                new Answer("Antwort 2"),
                new Answer("Antwort 3"),
                new Answer("Antwort 4", true)));
        questions.add(new Question("Frage 2",
                new Answer("Antwort 5"),
                new Answer("Antwort 6"),
                new Answer("Antwort 7"),
                new Answer("Antwort 8", true)));
        questions.add(new Question("Frage 3",
                new Answer("Antwort 9"),
                new Answer("Antwort 10"),
                new Answer("Antwort 11"),
                new Answer("Antwort 12", true)));
    }
}
