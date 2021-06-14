package com.company.WordAPI.models;


import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Words {

    @NotEmpty(message = "You must supply a word")
    private String word;
    @NotEmpty(message = "You must supply a definition")
    private String definition;
    private int id;

    public Words(){}

    public Words(String word, String definition, int id) {
        this.word = word;
        this.definition = definition;
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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
        if (!(o instanceof Words)) return false;
        Words words = (Words) o;
        return getId() == words.getId() && Objects.equals(getWord(), words.getWord()) && Objects.equals(getDefinition(), words.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord(), getDefinition(), getId());
    }


    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", id=" + id +
                '}';
    }
}
