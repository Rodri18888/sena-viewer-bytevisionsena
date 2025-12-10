package edu.misena.senaviewer.model;

public class Film {

    private String title;
    private String director;
    private int year;

    // Constructor que están usando
    public Film(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    // Getters (opcional pero recomendado)
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }
}