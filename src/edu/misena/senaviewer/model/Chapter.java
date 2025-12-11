package edu.misena.senaviewer.model;

public class Chapter {

    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean viewed;

    public Chapter(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.viewed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
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
        return "Chapter: " + title + " (" + duration + " min)";
    }
}