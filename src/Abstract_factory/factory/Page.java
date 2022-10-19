package Abstract_factory.factory;

import common.Param;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    private static final String DIRECTORY =
            Param.SRC_PATH + "Abstract_factory\\";
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String makeHTML();

    public void output() {
        String fileName = title + ".html";
        try {
            FileWriter writer = new FileWriter(DIRECTORY + fileName);
            writer.write(makeHTML());//template method模式
            writer.close();
            System.out.println(DIRECTORY + fileName + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Item item) {
        content.add(item);
    }
}
