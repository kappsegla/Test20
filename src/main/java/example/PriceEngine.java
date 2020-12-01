package example;

//Output based testing
public class PriceEngine {

    //Params notation ...
    public double calculateDiscount(Product... products) {
        double discount = products.length * 0.01;
        return Math.min(discount, 0.2);
    }
}
