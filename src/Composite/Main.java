package Composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory root = new Directory("root");

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 10_000));
        bin.add(new File("latex", 20_000));

        root.printList();


        System.out.println("Making usr entries...");

        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));

        hanako.add(new File("memo.tex", 300));

        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));

        root.printList();

    }
}
