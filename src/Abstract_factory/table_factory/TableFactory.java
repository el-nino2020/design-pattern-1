package Abstract_factory.table_factory;

import Abstract_factory.factory.Factory;
import Abstract_factory.factory.Link;
import Abstract_factory.factory.Page;
import Abstract_factory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
