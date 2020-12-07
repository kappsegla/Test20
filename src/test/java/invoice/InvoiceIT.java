package invoice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvoiceIT {

    @Test
    public void invoiceFails(){
        assertThat("Hej").isEqualTo("hej");
    }
}
