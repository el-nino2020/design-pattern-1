package Abstract_factory.list_factory;

import Abstract_factory.factory.Item;
import Abstract_factory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder ans = new StringBuilder();
        ans.append("<html><head><title>" + title + "</title></head><body>\n");
        ans.append("<h1>" + title + "</h1>");
        ans.append("<ul>\n");

        for (Item item : content) {
            ans.append(item.makeHTML());
        }
        ans.append("</ul>\n");
        ans.append("<hr><address>" + author + "</address>");
        ans.append("</body></html>\n");

        return ans.toString();
    }
}
