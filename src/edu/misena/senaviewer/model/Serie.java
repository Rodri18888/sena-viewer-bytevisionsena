package edu.misena.senaviewer.model;

import java.util.ArrayList;

public class Serie {

    private String title;
    private String director;
    private int year;
    private ArrayList<Chapter> chapters;

    public Serie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.chapters = new ArrayList<>();
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

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "Serie: " + title + " (" + year + ")";
    }
}