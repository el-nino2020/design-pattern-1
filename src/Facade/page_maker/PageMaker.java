package Facade.page_maker;

import common.Param;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String fileName) {
        try {
            Properties properties = DataBase.getProperties("mailData");
            String userName = properties.getProperty(mailAddress);
            String filePath = Param.SRC_PATH + "Facade\\" + fileName;
            HTMLWriter writer = new HTMLWriter(new FileWriter(
                    filePath));

            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph("欢迎来到" + userName + "的主页.");
            writer.paragraph("等着你的邮件哦!");
            writer.sendMail(mailAddress, userName);
            writer.close();
            System.out.println("生成的网页文件为: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
