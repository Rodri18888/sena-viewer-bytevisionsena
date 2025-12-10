package edu.misena.senaviewer.model;

public class Chapter extends Film {

    private int duration;
    private boolean viewed;

    public Chapter(String title, String director, int year, int duration) {
        super(title, director, year);
        this.duration = duration;
        this.viewed = false;
    }

    public int getDuration() {
        return duration;
    }

    public void markAsViewed() {
        viewed = true;
    }

    public boolean isViewed() {
        return viewed;
    }

    @Override
    public String toString() {
        return "Chapter: " + getTitle() + " (" + duration + " min)";
    }
}