package edu.misena.senaviewer.model;

import java.util.Date; 

public class Book extends Publication {
    
    // Atributos específicos
    private int isbn;
    private int pages;

    // Constructor que llama al constructor de Publication
    // (Ajusta los parámetros de super() según lo que pida la clase del líder)
    public Book(String title, Date editDate, String author, int isbn, int pages) {
        super(title, editDate, author); 
        this.isbn = isbn;
        this.pages = pages;
    }
    
    // *OPCIONAL*: Implementa el método abstracto si Publication lo tiene

    // Sobrescritura de toString() para añadir información específica
    @Override
    public String toString() {
        return "--- Libro ---\n" +
               super.toString() + 
               "  ISBN: " + this.isbn + "\n" +
               "  Páginas: " + this.pages + "\n";
    }
}