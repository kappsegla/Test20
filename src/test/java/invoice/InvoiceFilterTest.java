package invoice;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceFilterTest {

    @Test
    @Tag("SlowTests")
    void filterReturnsOnlyInvoicesWithValueUnder100() {
        //Arrange
        InvoiceFilter filter = new InvoiceFilter(new InvoiceDaoStub());
        //Act
        var result = filter.filter();
        //Assert
        assertEquals(List.of(new Invoice("Martin", 10), new Invoice("Anna", 50)), result);
    }

    @Test
    void filterReturnsOnlyInvoicesWithValueUnder100UsingMockito() {
        //Arrange
        InvoiceDao invoiceDao = mock(InvoiceDao.class);
        when(invoiceDao.all()).thenReturn(List.of(new Invoice("Martin", 10),
                new Invoice("Kalle", 109),
                new Invoice("Anna", 50)));

        InvoiceFilter filter = new InvoiceFilter(invoiceDao);
        //Act
        var result = filter.filter();

        //verify(invoiceDao).all();  //No, this is a query object, we don't care if it has been called or not.
        //Assert
        assertEquals(List.of(new Invoice("Martin", 10), new Invoice("Anna", 50)), result);
    }

    @Test
    void filterUsingFakeTestDoubleReturnsOnlyInvoicesWithValueUnder100() {
        //Arrange
        InvoiceDao invoiceDao = new InvoiceDaoFake();
        InvoiceFilter filter = new InvoiceFilter(invoiceDao);
        invoiceDao.save(new Invoice("Martin", 10));
        invoiceDao.save(new Invoice("Kalle", 109));
        invoiceDao.save(new Invoice("Anna", 50));

        //Act
        var result = filter.filter();
        //Assert
        assertEquals(List.of(new Invoice("Martin", 10), new Invoice("Anna", 50)), result);
    }
}