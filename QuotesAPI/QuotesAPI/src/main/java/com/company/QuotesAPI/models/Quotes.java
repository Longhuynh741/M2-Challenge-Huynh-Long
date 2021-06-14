package com.company.QuotesAPI.models;


import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Quotes {


    @NotEmpty(message = "You must supply a value for quote")
    private String quote;
    @NotEmpty(message = "you must supply a value for artist")
    private String artist;
    private int id;

    public Quotes(){}

    public Quotes(String quote, String artist, int id) {
        this.quote = quote;
        this.artist = artist;
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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
        if (!(o instanceof Quotes)) return false;
        Quotes quotes = (Quotes) o;
        return getId() == quotes.getId() && Objects.equals(getQuote(), quotes.getQuote()) && Objects.equals(getArtist(), quotes.getArtist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuote(), getArtist(), getId());
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "quote='" + quote + '\'' +
                ", artist='" + artist + '\'' +
                ", id=" + id +
                '}';
    }
}
