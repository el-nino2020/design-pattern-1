package Proxy.exercise21_1;

import Proxy.Printable;

public class PrinterProxy implements Printable {
    private String name = null;
    private Printable printer = null;
    private String printerClass;

    public PrinterProxy(String printerClass) {
        this.printerClass = printerClass;
    }

    public PrinterProxy(String printerClass, String name) {
        this(printerClass);
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
        if (printer == null) {
            try {
                printer = (Printable) Class.forName(printerClass).newInstance();
                printer.setPrinterName(name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
