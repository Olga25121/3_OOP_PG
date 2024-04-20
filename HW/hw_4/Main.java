package HW.hw_4;


public class Main {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Мастер и Маргарита");
        Book<String> book2 = new Book<>("Маленький принц");
        Book<String> book3 = new Book<>("Собачье сердце");
        Book<String> book4 = new Book<>("Приключения Шерлока Холмса");
        Book<String> book5 = new Book<>("Лабиринты Ехо");
        
        
      

        Library <Book<String>> library = new Library<>();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        

        library.giveBook(book1);
        library.giveBook(book3);
        library.giveBook(book5);

        library.showGivenBooks();
        library.showRemainedBooks();
    }
}

