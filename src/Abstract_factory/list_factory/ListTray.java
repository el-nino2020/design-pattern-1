package Abstract_factory.list_factory;

import Abstract_factory.factory.Item;
import Abstract_factory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder ans = new StringBuilder();

        ans.append("<li>\n");
        ans.append(caption + "\n");
        ans.append("<ul>\n");

        for (Item item : tray) {
            ans.append(item.makeHTML());
        }

        ans.append("</ul>\n</li>\n");
        return ans.toString();
    }
}
