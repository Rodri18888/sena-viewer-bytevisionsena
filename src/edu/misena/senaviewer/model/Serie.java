package edu.misena.senaviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

    private ArrayList<Chapter> chapters;

    public Serie(String title, String director, int year) {
        super(title, director, year);
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "Serie: " + getTitle() + " (" + getYear() + ")";
    }
}