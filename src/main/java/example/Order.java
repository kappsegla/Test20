package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//State based testing
class Order {
    private final List<Product> products = new ArrayList<>();

    //Changes internal state, should return void
    public void AddProduct(Product product) {
        products.add(product);
    }

    //Returns something, do not change internal state from methods that returns stuff.
    public int productCount() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products.stream().collect(Collectors.toUnmodifiableList());
    }


}
