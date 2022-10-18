package factory_method.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    //注意访问权限
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
