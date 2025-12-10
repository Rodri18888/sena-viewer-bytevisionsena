package edu.misena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Chapter;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        // Menú principal
        // ========================
        int opcion;
        do {
            System.out.println("\n=== SENA VIEWER ===");
            System.out.println("1. Listar películas");
            System.out.println("2. Listar series");
            System.out.println("3. Reproducir película");
            System.out.println("4. Reproducir capítulo de serie");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nPelículas disponibles:");
                    for (int i = 0; i < movies.size(); i++) {
                        System.out.println((i + 1) + ". " + movies.get(i));
                    }
                    break;

                case 2:
                    System.out.println("\nSeries disponibles:");
                    for (int i = 0; i < series.size(); i++) {
                        System.out.println((i + 1) + ". " + series.get(i));
                    }
                    break;

                case 3:
                    System.out.println("\nSeleccione la película a reproducir:");
                    for (int i = 0; i < movies.size(); i++) {
                        System.out.println((i + 1) + ". " + movies.get(i).getTitle());
                    }
                    int mIndex = sc.nextInt() - 1;
                    if (mIndex >= 0 && mIndex < movies.size()) {
                        Movie selectedMovie = movies.get(mIndex);
                        selectedMovie.markAsViewed();
                        System.out.println("Reproduciendo: " + selectedMovie.getTitle());
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 4:
                    System.out.println("\nSeleccione la serie:");
                    for (int i = 0; i < series.size(); i++) {
                        System.out.println((i + 1) + ". " + series.get(i).getTitle());
                    }
                    int sIndex = sc.nextInt() - 1;
                    if (sIndex >= 0 && sIndex < series.size()) {
                        Serie selectedSerie = series.get(sIndex);
                        System.out.println("Capítulos disponibles:");
                        for (int i = 0; i < selectedSerie.getChapters().size(); i++) {
                            System.out.println((i + 1) + ". " + selectedSerie.getChapters().get(i));
                        }
                        System.out.println("Seleccione capítulo a reproducir:");
                        int cIndex = sc.nextInt() - 1;
                        if (cIndex >= 0 && cIndex < selectedSerie.getChapters().size()) {
                            System.out.println("Reproduciendo: " +
                                    selectedSerie.getChapters().get(cIndex).toString());
                        } else {
                            System.out.println("Opción inválida.");
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de SENA Viewer...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}