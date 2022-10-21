package Visitor.exercise13_1;

import Visitor.Visitor;
import Visitor.File;
import Visitor.Directory;
import Visitor.Entry;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String filePostfix;
    private ArrayList<File> foundFiles = new ArrayList<File>();

    public Iterator<File> getFoundFiles() {
        return foundFiles.iterator();
    }

    public FileFindVisitor(String filePostfix) {
        this.filePostfix = filePostfix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filePostfix)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(this);
        }
    }
}
