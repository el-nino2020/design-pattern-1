package Factory_method.idcard;

import Factory_method.framework.Product;

public class IDCard extends Product {
    private String owner;

    //注意访问权限
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
