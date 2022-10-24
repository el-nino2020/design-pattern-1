package Proxy;

public class PrinterProxy implements Printable {
    private String name = null;
    private Printer printer = null;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        this.name = name;
        if (printer != null)
            printer.setPrinterName(name);
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        printer.print(string);
    }

    private synchronized void realize() {
        if (printer == null)
            printer = new Printer(name);
    }
}
