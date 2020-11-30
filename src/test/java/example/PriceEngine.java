package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


//Output based testing
public class PriceEngine {

    public double calculateDiscount(Product... products) {
        double discount = products.length * 0.01;
        return Math.min(discount, 0.2);
    }

    @Test
    public void Discount_of_two_products() {
        var product1 = new Product("Hand wash");
        var product2 = new Product("Shampoo");
        var sut = new PriceEngine();
        double discount = sut.calculateDiscount(product1, product2);
        assertEquals(0.02, discount);
    }
}

class Product {

    private final String productName;

    public Product(String productName) {
        this.productName = productName;
    }
}

//State based testing
class Order {
    private final List<Product> products = new ArrayList<>();

    public void AddProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products.stream().collect(Collectors.toUnmodifiableList());
    }

    @Test
    public void Adding_a_product_to_an_order() {
        var product = new Product("Hand wash");
        var sut = new Order();
        sut.AddProduct(product);
        var products = sut.getProducts();
        assertEquals(1, products.size());
        assertEquals(product, products.get(0));
    }
}

interface EmailGateway {

    void sendGreetingsEmail(String s);
}

//Communication based testing
class Controller {


    private final EmailGateway emailGateway;

    public Controller(EmailGateway emailGateway) {
        this.emailGateway = emailGateway;
    }

    private void GreetUser(String adress) {
        emailGateway.sendGreetingsEmail(adress);
    }

    @Test
    public void Sending_a_greetings_email() {
        var emailGatewayMock = mock(EmailGateway.class);
        var sut = new Controller(emailGatewayMock);
        sut.GreetUser("user@email.com");
        verify(emailGatewayMock, atMostOnce()).sendGreetingsEmail("user@email.com");
    }
}

