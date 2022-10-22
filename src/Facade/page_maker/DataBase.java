package Facade.page_maker;

import common.Param;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataBase {
    private DataBase() {
    }

    public static Properties getProperties(String DBName) {
        String filePath = Param.SRC_PATH + "Facade\\" + DBName + ".txt";
        Properties ans = new Properties();

        try {
            ans.load(new FileInputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ans;

    }
}
