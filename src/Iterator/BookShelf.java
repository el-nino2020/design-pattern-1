package Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int size = 0;

    public BookShelf(int capacity) {
        books = new Book[capacity];
    }

    public Book getBookAt(int index) {
        //check argument
        return books[index];
    }

    public void appendBook(Book book) {
        //check size
        books[size] = book;
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);//this用得挺妙的
    }
}
