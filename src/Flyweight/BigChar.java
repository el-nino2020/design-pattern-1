package Flyweight;

import common.Param;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    Param.SRC_PATH + "Flyweight\\bigCharData\\big" + charName + ".txt"));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            reader.close();
            fontData = sb.toString();
        } catch (IOException e) {
            //不存在形如big<charName>.txt的文件
            fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
