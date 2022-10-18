package Adapter.exercise2_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties properties = new Properties();

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileOutputStream(fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
