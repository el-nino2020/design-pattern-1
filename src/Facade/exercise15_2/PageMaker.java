package Facade.exercise15_2;

import Facade.page_maker.DataBase;
import Facade.page_maker.HTMLWriter;
import common.Param;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeLinkPage(String fileName) {
        try {
            Properties properties = DataBase.getProperties("mailData");
            String filePath = Param.SRC_PATH + "Facade\\" + fileName;
            HTMLWriter writer = new HTMLWriter(new FileWriter(filePath));

            writer.title("Link Page");

            for (Object key : properties.keySet()) {
                writer.sendMail((String) key, properties.getProperty((String) key));
            }

            writer.close();

            System.out.println("生成的网页文件为: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
