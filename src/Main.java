import models.Book;
import models.Librarian;
import models.Student;
import services.LoanService;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Juan Pérez", "L123");
        Student student = new Student("Ana López", "S456");
        // Crear el servicio de préstamos
        LoanService loanService = new LoanService();

        // Crear un libro
        Book book = new Book("diario del fin del mundo", "Marioo Mendoza", true);

        librarian.makeLoan(book);
         // Intenta que el estudiante también pida el préstamo

        
        // Realizar un préstamo
        loanService.loanBook(book, student);
        
        student.makeLoan(book);

        // Mostrar el rol del bibliotecario y estudiante en la consola
        System.out.println(librarian.showRole());
        System.out.println(student.showRole());

    }
}
