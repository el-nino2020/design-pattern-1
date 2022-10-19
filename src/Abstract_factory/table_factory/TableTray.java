package Abstract_factory.table_factory;

import Abstract_factory.factory.Item;
import Abstract_factory.factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder ans = new StringBuilder();

        ans.append("<td>");
        ans.append("<table width=\"100%\" border = \"1\"><tr>");
        ans.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size()
                + "\"><b>" + caption + "</b></td>");
        ans.append("</tr><tr>");


        for (Item item : tray) {
            ans.append(item.makeHTML());
        }

        ans.append("</tr></table></td>");

        return ans.toString();
    }
}
