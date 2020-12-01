package example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestValidation {
    @Nested
    public class PriceEngineTest {
        @Test
        public void Discount_of_two_products() {
            var product1 = new Product("Hand wash");
            var product2 = new Product("Shampoo");
            var sut = new PriceEngine();
            double discount = sut.calculateDiscount(product1, product2);
            assertEquals(0.02, discount);
        }
    }
    @Nested
    public class OrderTest {
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
    @Nested
    public class ControllerTest {
        @Test
        public void Sending_a_greetings_email() {
            var emailGatewayMock = mock(EmailGateway.class);
            var sut = new Controller(emailGatewayMock);
            sut.GreetUser("user@email.com");
            verify(emailGatewayMock, atLeastOnce()).sendGreetingsEmail("user@email.com");
        }
    }

}