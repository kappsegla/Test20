package invoice;

import java.util.List;

public class InvoiceDaoStub implements InvoiceDao {
    @Override
    public List<Invoice> all() {
        return List.of(new Invoice("Martin", 10),
                new Invoice("Kalle", 109),
                new Invoice("Anna", 50));
    }

    @Override
    public void save(Invoice inv) {

    }

    @Override
    public void close() {

    }
}
