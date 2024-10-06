package models;

public class Librarian extends User {

    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void makeLoan(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();  // Cambia el estado del libro a prestado
            System.out.println("El bibliotecario " + getName() + " ha registrado el préstamo del libro '" + book.getTitle() + "'.");
        } else {
            System.out.println("El libro '" + book.getTitle() + "' no está disponible para préstamo.");
        }
    }

    @Override
    public String showRole() {
        return "Soy un bibliotecario."; // Asegúrate de que devuelva un String
    }
}