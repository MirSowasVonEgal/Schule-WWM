package me.mirsowasvonegal.wwm.models;

import java.util.HashMap;

public class Question {

    private String question;
    private Answer[] answers;

    public Answer[] getAnswers() {
        return answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question(String question, Answer... answers) {
        this.question = question;
        this.answers = answers;
    }
}
