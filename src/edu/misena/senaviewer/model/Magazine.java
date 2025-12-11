package edu.misena.senaviewer.model;

public class Magazine extends Publication {
    
    // Atributo específico
    private int editionNumber;

    // Constructor que llama al constructor de Publication
    public Magazine(String title, String editionDate, String author, int editionNumber) {
        // Llama a super
        super(title, editionDate, author); 
        this.editionNumber = editionNumber;
    }
    
    // *OPCIONAL*: Implementa el método abstracto si Publication lo tiene

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return "--- Revista ---\n" +
               super.toString() + 
               "  Número de Edición: " + this.editionNumber + "\n";
    }
}