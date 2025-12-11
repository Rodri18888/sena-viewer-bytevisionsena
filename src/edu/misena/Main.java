package edu.misena;

import edu.misena.senaviewer.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Movie> movies = new ArrayList<>();
    static List<Serie> series = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    static List<Magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {

        loadExampleData();

        showMenu();
    }


    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        do {
            System.out.println("\n==============================");
            System.out.println("        SENA VIEWER APP");
            System.out.println("==============================");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. General Report");
            System.out.println("6. Today’s Report");
            System.out.println("0. Exit");
            System.out.println("==============================");
            System.out.print("Choose an option: ");

            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                option = -1;
            }

            switch (option) {
                case 1 -> showMovies();
                case 2 -> showSeries();
                case 3 -> showBooks();
                case 4 -> showMagazines();
                case 5 -> generateGeneralReport();
                case 6 -> generateTodayReport();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option. Try again.");
            }

        } while (option != 0);
    }


    public static void showMovies() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- MOVIE LIST ---");
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println((i + 1) + ". " + m.getTitle() +
                    (m.isViewed() ? " (VIEWED)" : ""));
        }
        System.out.println("0. Back");

        System.out.print("Select a movie to watch: ");
        int option = Integer.parseInt(sc.nextLine());

        if (option == 0) return;

        if (option < 1 || option > movies.size()) {
            System.out.println("Invalid option.");
            return;
        }

        Movie selected = movies.get(option - 1);

        selected.setViewed(true);
        selected.setTimeViewed(selected.getDuration());

        System.out.println("You watched: " + selected.getTitle());
    }


    public static void showSeries() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- SERIES LIST ---");
        for (int i = 0; i < series.size(); i++) {
            Serie s = series.get(i);
            System.out.println((i + 1) + ". " + s.getTitle() +
                    (s.isViewed() ? " (VIEWED)" : ""));
        }
        System.out.println("0. Back");

        System.out.print("Select a series: ");
        int option = Integer.parseInt(sc.nextLine());

        if (option == 0) return;

        if (option < 1 || option > series.size()) {
            System.out.println("Invalid option.");
            return;
        }

        Serie selected = series.get(option - 1);

        selected.setViewed(true);
        selected.setTimeViewed(selected.getDuration() * 10);

        System.out.println("You watched the series: " + selected.getTitle());
    }


    public static void showBooks() {
        System.out.println("\n--- BOOK LIST ---");
        for (Book b : books) {
            System.out.println("- " + b.getTitle());
        }
    }


    public static void showMagazines() {
        System.out.println("\n--- MAGAZINE LIST ---");
        for (Magazine m : magazines) {
            System.out.println("- " + m.getTitle());
        }
    }


    public static void generateGeneralReport() {
        System.out.println("\n--- GENERAL REPORT ---");
        System.out.println("Movies watched:");

        for (Movie m : movies)
            if (m.isViewed())
                System.out.println("- " + m.getTitle());

        System.out.println("\nSeries watched:");
        for (Serie s : series)
            if (s.isViewed())
                System.out.println("- " + s.getTitle());
    }


    public static void generateTodayReport() {
        System.out.println("\n--- TODAY’S REPORT ---");

        generateGeneralReport();
    }


    public static void loadExampleData() {

        movies.add(new Movie("Avengers", "Action", "Marvel", 120, 2012));
        movies.add(new Movie("Titanic", "Drama", "James Cameron", 195, 1997));

        series.add(new Serie("Breaking Bad", "Drama", 50));
        series.add(new Serie("One Piece", "Adventure", 20));

        books.add(new Book(
                "The Hobbit",
                "2020-05-10",
                "Minotauro",
                123456789,
                310
        ));

        magazines.add(new Magazine(
                "National Geographic",
                "2024-01-01",
                "NatGeo",
                45
        ));
    }
}
