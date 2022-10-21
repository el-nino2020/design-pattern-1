package Visitor.exercise13_1;

import Visitor.Directory;
import Visitor.File;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 10_000));
        bin.add(new File("latex", 20_000));

        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        yuki.add(new File("diary.html", 100));
        yuki.add(new File("java", 200));

        hanako.add(new File("memo.tex", 300));
        hanako.add(new File("index.html", 350));

        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));


        FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
        root.accept(fileFindVisitor);

        Iterator<File> iterator = fileFindVisitor.getFoundFiles();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
