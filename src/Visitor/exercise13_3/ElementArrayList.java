package Visitor.exercise13_3;

import Visitor.Element;
import Visitor.Entry;
import Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Entry> implements Element {
    @Override
    public void accept(Visitor visitor) {
        Iterator<Entry> iterator = iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }
}
