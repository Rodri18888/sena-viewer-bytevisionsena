package edu.misena.senaviewer.model;
import java.util.ArrayList;
import java.util.List;

public class Publication {

    protected String title;               
    protected String edititionDate;        
    protected String editorial;           
    protected List<String> authors;       

    public Publication(String title, String edititionDate, String editorial) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
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

