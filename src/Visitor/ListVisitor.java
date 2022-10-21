package Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDirectory = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDirectory + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDirectory + "/" + directory);
        String copy = this.currentDirectory;

        currentDirectory += "/" + directory.getName();

        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(this);
            //下面这行代码和上一行是类似的，本质都是递归调用，但是visit不接受Entry类型的参数，故应该让
            //Entry对象调用accept
            //visit(iterator.next());
        }

        currentDirectory = copy;
    }
}
