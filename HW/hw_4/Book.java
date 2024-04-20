package HW.hw_4;

public class Book<T> {

    private T bookTitle;

    public Book(T bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book() {
        
    }

    public T getbookTitle() {
        return bookTitle;
    }
    

    @Override
    public String toString() {
        return bookTitle.toString();
    }
}



