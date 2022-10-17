package Iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index = -1;//这里与书中例子不同，迭代器的指针的初始值通常是位于首个元素之前

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < bookShelf.size(); //书上的代码明显有点幼稚
    }

    @Override
    public Object next() {
        index++;
        return bookShelf.getBookAt(index);
    }
}
