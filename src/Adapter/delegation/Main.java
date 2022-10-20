package Adapter.delegation;

//演示使用委托(delegation)的适配器
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printStrong();
        p.printWeak();
    }
}
