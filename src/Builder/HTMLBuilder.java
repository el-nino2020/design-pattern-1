package Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private static final String FILE_DIRECTORY = "D:\\CODES(daima)\\design-pattern-1\\src\\Builder\\";
    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(FILE_DIRECTORY + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String string) {
        writer.println("<p>" + string + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return FILE_DIRECTORY + fileName;
    }
}
