package edu.misena.senaviewer.model;
import java.util.ArrayList;
import java.util.List;

public class Publication {

    protected String title;               
    protected String editionDate;        
    protected String editorial;           
    protected List<String> authors;       

    public Publication(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEdititionDate(String edititionDate) {
        this.editionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}

