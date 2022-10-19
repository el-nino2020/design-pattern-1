package Builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("输入p：plain");
        System.out.println("输入h：html");
        System.out.print("你的输入: ");

        String choice = new Scanner(System.in).next();

        if ("p".equals(choice)) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);

            director.construct();

            String result = builder.getResult();

            System.out.println(result);
        } else if ("h".equals(choice)) {
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);

            director.construct();

            String path = builder.getResult();

            System.out.println("结果保存至 " + path);
        } else {
            System.out.println("输入有误");
        }
    }
}
