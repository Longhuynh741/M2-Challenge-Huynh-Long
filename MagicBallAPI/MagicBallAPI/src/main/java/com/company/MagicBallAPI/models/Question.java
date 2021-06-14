package com.company.MagicBallAPI.models;


import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Question {
    @NotEmpty(message = "You must supply a question")
    private String question;
    private String answer;
    private int id;

    public Question(String question, String answer, int id) {
        this.question = question;
        this.answer = answer;
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public  void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question1 = (Question) o;
        return getId() == question1.getId() && Objects.equals(getQuestion(), question1.getQuestion()) && Objects.equals(getAnswer(), question1.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestion(), getAnswer(), getId());
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                '}';
    }
}
