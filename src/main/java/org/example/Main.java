package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        library.addBook("Knyga1", "Autorius1");
        library.addBook("Knyga2", "Autorius2");
        library.addBook("Knyga3", "Autorius3");
        library.addBook("Knyga4", "Autorius4");
        library.addBook("Knyga5", "Autorius5");
        library.spausdintiSaras();
        library.removeBook(library.findBook("Knyga2"));
        library.spausdintiSaras();
    }
}