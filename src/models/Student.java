package models;

public class Student extends User {

    public Student(String name, String id) {
        super(name, id);  // Llamada al constructor de User
    }

    @Override
    public void makeLoan(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();  // Cambia el estado del libro a prestado
            System.out.println("El estudiante " + getName() + " ha registrado el préstamo del libro '" + book.getTitle() + "'.");
        } else {
            System.out.println("El libro '" + book.getTitle() + "' no está disponible para préstamo.");
        }
    }

    @Override
    public String showRole() {
        return "Soy un estudiante."; // Asegúrate de que devuelva un String
    }
}

