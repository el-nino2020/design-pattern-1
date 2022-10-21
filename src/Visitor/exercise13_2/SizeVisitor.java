package Visitor.exercise13_2;


import Visitor.Visitor;
import Visitor.File;
import Visitor.Directory;
import Visitor.Entry;

import java.util.Iterator;


public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(this);
        }

    }

}
