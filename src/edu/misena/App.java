package edu.misena;

import java.util.ArrayList;
import java.util.List;

import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Chapter;

public class App {
    public static void main(String[] args) {

        // ========================
        // Lista de películas
        // ========================
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Christopher Nolan", 2010, 148));
        movies.add(new Movie("Forrest Gump", "Robert Zemeckis", 1994, 142));
        movies.add(new Movie("The Matrix", "The Wachowskis", 1999, 136));
        movies.add(new Movie("Gladiator", "Ridley Scott", 2000, 155));
        movies.add(new Movie("Interstellar", "Christopher Nolan", 2014, 169));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", 2008, 152));
        movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", 1994, 154));
        movies.add(new Movie("The Lord of the Rings", "Peter Jackson", 2001, 178));
        movies.add(new Movie("Titanic", "James Cameron", 1997, 195));
        movies.add(new Movie("Avatar", "James Cameron", 2009, 162));

        // ========================
        // Lista de series con 1 temporada de 10 capítulos
        // ========================
        List<Serie> series = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Serie serie = new Serie("Serie " + i, "Creador " + i, 2010 + i);
            for (int j = 1; j <= 10; j++) {
                serie.addChapter(new Chapter(
                        "Episodio " + j,
                        "Director " + j,
                        2010 + i,
                        40 + j // duración 41-50 min
                ));
            }
            series.add(serie);
        }

        // ========================
        // Pruebas básicas
        // ========================
        // Marcar la primera película como vista
        Movie firstMovie = movies.get(0);
        System.out.println(firstMovie);
        firstMovie.markAsViewed();
        System.out.println("Visto: " + firstMovie.isViewed());

        // Marcar el primer capítulo de la primera serie como visto
        Serie firstSerie = series.get(0);
        Chapter firstChapter = firstSerie.getChapters().get(0);
        System.out.println(firstSerie);
        System.out.println(firstSerie.getChapters());
    }
}