package Adapter.compose;

//演示使用委托(组合)的适配器
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printStrong();
        p.printWeak();
    }
}
