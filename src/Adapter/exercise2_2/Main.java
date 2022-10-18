package Adapter.exercise2_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //absolute path of parent directory of this file
        String path = "D:\\CODES(daima)\\design-pattern-1\\src\\Adapter\\exercise2_2\\";
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile(path + "file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile(path + "newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
