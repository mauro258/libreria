package services;

import models.Book;
import models.User;

public class LoanService {
    
    public void loanBook(Book book, User user) {
        System.out.println(user.getName() + " ha tomado prestado el libro: " + book.getTitle());
    }
}
