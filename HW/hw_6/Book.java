package HW.hw_6;

// Класс Book реализует принцип Single Responsibility Principle (SRP),
// так как он отвечает только за представление книги.
public class Book<T> {
    private T title;
    private boolean isCheckedOut;

    public Book(T title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public T getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void checkIn() {
        isCheckedOut = false;
    }
}