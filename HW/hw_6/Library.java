package HW.hw_6;

import java.util.ArrayList;
import java.util.List;

// Класс Library реализует принцип Single Responsibility Principle (SRP),
// так как он отвечает только за управление коллекцией книг.
public class Library {
    private List<Book<?>> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод addBook() реализует принцип Open/Closed Principle (OCP),
    // так как он открыт для расширения (добавления новых типов книг),
    // но закрыт для модификации.
    public  <T> void addBook(Book <T> book) {
        books.add(book);
    }

    // Метод checkOutBook() реализует принцип Dependency Inversion Principle (DIP),
    // так как он зависит от абстракции (Book), а не от конкретной реализации.
    public <T> void checkOutBook(Book<T> book) {
        if (!book.isCheckedOut()) {
            book.checkOut();
            System.out.println("Книга '" + book.getTitle() + "' выдана.");
        } else {
            System.out.println("Книга '" + book.getTitle() + "' уже выдана.");
        }
    }

    // Метод checkInBook() реализует принцип Dependency Inversion Principle (DIP),
    // так как он зависит от абстракции (Book), а не от конкретной реализации.
    public <T> void checkInBook(Book<T> book) {
        if (book.isCheckedOut()) {
            book.checkIn();
            System.out.println("Возвращены: Книга '" + book.getTitle() + "' ");
            System.out.println("----------------");
        } else {
            
            System.out.println("В наличии:  Книга '" + book.getTitle() + "' ");
        }
    }

    // Метод printCheckedOutBooks() реализует принцип Liskov Substitution Principle (LSP),
    // так как он работает с коллекцией Book<?>, не требуя конкретных типов книг.
    public void printCheckedOutBooks() {
        System.out.println("----------------");
        System.out.println("Выданные книги:");
        System.out.println("----------------");
        for (Book<?> book : books) {
            if (book.isCheckedOut()) {
                System.out.println("- " + book.getTitle());
                
            }
            
        }
    }
}