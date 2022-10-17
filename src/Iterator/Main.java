package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
//        BookShelf bookShelf = new BookShelf(4); //检验边界情况，这里检验后是OK的

        bookShelf.appendBook(new Book("Alpha"));
        bookShelf.appendBook(new Book("Beta"));
        bookShelf.appendBook(new Book("Theta"));
        bookShelf.appendBook(new Book("Delta"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Book) iterator.next()).getName());
        }
    }
}
