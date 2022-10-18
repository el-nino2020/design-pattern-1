package Prototype.framework;

import java.util.HashMap;

public class Manager {
    //showcase: 玻璃陈列柜
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        return showcase.get(protoName).createClone();
    }
}
