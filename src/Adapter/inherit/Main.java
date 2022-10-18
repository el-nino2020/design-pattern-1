package Adapter.inherit;

//演示使用继承的适配器
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printStrong();
        p.printWeak();
    }
}
