package HW.hw_4;

import java.util.ArrayList;
import java.util.List;

public class Library <T extends Book> {

    private List<T> books = new ArrayList<>();
    private List<T> givenBooks = new ArrayList<>();

    public void addBook(T book) {
        books.add(book);
    }

    public void giveBook(T book) {
        books.remove(book);
        givenBooks.add(book);
    }

    public void showGivenBooks() {
        System.out.println("----------------");
        System.out.println("Выданные книги:");
        System.out.println("----------------");
        for (T book : givenBooks) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void showRemainedBooks() {
        System.out.println("----------------");
        System.out.println("Книги в наличии:");
        System.out.println("----------------");
        for (T book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    
}




