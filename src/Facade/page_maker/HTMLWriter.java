package Facade.page_maker;

import java.io.IOException;
import java.io.Writer;

public class HTMLWriter {
    private Writer writer;

    public HTMLWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html><head>");
        writer.write("<title>" + title + "</title>\n");
        writer.write("</head><body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String message) throws IOException {
        writer.write("<p>" + message + "</p>\n");
    }

    public void link(String link, String caption) throws IOException {
        paragraph("<a href=\"" + link + "\">" + caption + "</a>");
    }

    public void sendMail(String mailAddress, String userName) throws IOException {
        link(mailAddress, userName);
    }

    public void close() throws IOException {
        writer.write("</body></html>\n");
        writer.close();
    }
}


















