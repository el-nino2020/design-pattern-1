package Proxy;

public class Printer implements Printable {
    private String name = null;


    public Printer() {
        heavyJob("正在生成Printer实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer实例 (" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String string) {
        System.out.print(string);

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }

        System.out.println("finish");
    }

}
