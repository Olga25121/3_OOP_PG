package HW.hw_6;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>("Мастер и Маргарита");
        Book<String> book2 = new Book<>("Маленький принц");
        Book<String> book3 = new Book<>("Собачье сердце");
        Book<String> book4 = new Book<>("Приключения Шерлока Холмса");
        Book<String> book5 = new Book<>("Лабиринты Ехо");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.checkOutBook(book1);
        library.checkOutBook(book3);
        library.checkOutBook(book5);

        library.printCheckedOutBooks();
        System.out.println("----------------");

        library.checkInBook(book2);
        library.checkInBook(book4);
        

        System.out.println("----------------");
        library.checkInBook(book1);
        
    }
}
