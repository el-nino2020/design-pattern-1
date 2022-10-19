package Abstract_factory;

import Abstract_factory.factory.Factory;
import Abstract_factory.factory.Link;
import Abstract_factory.factory.Page;
import Abstract_factory.factory.Tray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("l: List Factory");
        System.out.println("t: Table Factory");
        System.out.print("请选择factory:  ");
        String choice = new Scanner(System.in).next();
        String className = null;
        String pageName = null;
        switch (choice) {
            case "l":
                className = "Abstract_factory.list_factory.ListFactory";
                pageName = "ListLinkPage";
                break;
            case "t":
                className = "Abstract_factory.table_factory.TableFactory";
                pageName = "TableLinkPage";

                break;
            default:
                System.out.println("输入有误，程序退出");
                return;
        }


        Factory factory = Factory.getFactory(className);
///////////////////////////////////////////////////////////////////////////////////////////
        Link github = factory.createLink("Github", "https://github.com/");
        Link stackoverflow = factory.createLink("stackoverflow", "https://stackoverflow.com/");

        Tray programmingTray = factory.createTray("programming");
        programmingTray.add(github);
        programmingTray.add(stackoverflow);
///////////////////////////////////////////////////////////////////////////////////////////
        Link google = factory.createLink("Google", "https://www.google.com/");
        Link bing = factory.createLink("Bing", "https://www.bing.com/");

        Tray searchTray = factory.createTray("搜索引擎");
        searchTray.add(google);
        searchTray.add(bing);
///////////////////////////////////////////////////////////////////////////////////////////
        Page page = factory.createPage(pageName, "El nino");
        page.add(programmingTray);
        page.add(searchTray);
        page.output();
    }
}
