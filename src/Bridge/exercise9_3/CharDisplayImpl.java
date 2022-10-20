package Bridge.exercise9_3;

import Bridge.DisplayImpl;

public class CharDisplayImpl extends DisplayImpl {
    private char head;
    private char decoration;
    private char tail;

    public CharDisplayImpl(char head, char decoration, char tail) {
        this.head = head;
        this.decoration = decoration;
        this.tail = tail;
    }

    @Override
    public void rawOpen() {
        System.out.print(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(decoration);
    }

    @Override
    public void rawClose() {
        System.out.println(tail);
    }
}
