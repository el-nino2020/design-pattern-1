package Proxy.exercise21_1;

import Proxy.Printable;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Proxy.Printer","Alice");
        System.out.println(p.getPrinterName());

        p.setPrinterName("Bob");
        System.out.println(p.getPrinterName());

        p.print("hell, world");
    }
}
