package me.mirsowasvonegal.wwm.models;

import me.mirsowasvonegal.wwm.gui.GUI;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private ArrayList<Question> questions = new ArrayList<>();
    private GUI gui;
    private Random random = new Random();

    public Game() {
        importQuestions();

        gui = new GUI();
    }

    public Question getRandomQuestion() {
        return questions.get(random.nextInt(questions.size()));
    }

    private void importQuestions() {
        questions.add(new Question("Frage 1",
                new Answer("Antwort 1"),
                new Answer("Antwort 2"),
                new Answer("Antwort 3"),
                new Answer("Antwort 4", true)));
    }
}
