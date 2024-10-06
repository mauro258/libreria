package models;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Método para marcar el libro como prestado
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("El libro '" + title + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + title + "' ya está prestado.");
        }
    }

    // Método para devolver el libro
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("El libro '" + title + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + title + "' ya estaba disponible.");
        }
    }
}
