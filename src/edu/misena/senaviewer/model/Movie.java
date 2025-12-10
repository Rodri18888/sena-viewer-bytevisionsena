package edu.misena.senaviewer.model;

public class Movie extends Film {

    private int duration;       // duración en minutos
    private boolean viewed;     // si ya la vio o no

    public Movie(String title, String director, int year, int duration) {
        super(title, director, year);
        this.duration = duration;
        this.viewed = false;
    }

    public int getDuration() {
        return duration;
    }

    public void markAsViewed() {
        this.viewed = true;
    }

    public boolean isViewed() {
        return viewed;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " (" + getYear() + ") - " + duration + " min";
    }
}