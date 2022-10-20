package Bridge.exercise9_2;

import Bridge.DisplayImpl;

import java.io.*;

public class TextDisplayImpl extends DisplayImpl {
    private String filePath;
    private BufferedReader reader;
    private String content;

    public TextDisplayImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filePath));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }

            content = builder.toString();//必须把文本内容存在内存中，因为之后可能会多次print
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("================= START ======================");
    }

    @Override
    public void rawPrint() {
        System.out.print(content);
    }

    @Override
    public void rawClose() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("================= END ======================");

    }
}
