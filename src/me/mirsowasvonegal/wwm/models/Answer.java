package me.mirsowasvonegal.wwm.models;

public class Answer {

    private String answer;
    private Boolean correct;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Answer(String answer) {
        this.answer = answer;
        this.correct = false;
    }

    public Answer(String answer, Boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }
}
