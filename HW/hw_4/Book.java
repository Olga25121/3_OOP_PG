package HW.hw_4;

public class Book<T> {

    private T bookName;

    public Book(T bookName) {
        this.bookName = bookName;
    }

    public Book() {
        
    }

    public T getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return bookName.toString();
    }
}
