package invoice;

import java.util.List;

public class InvoiceDaoDummy implements InvoiceDao {
    @Override
    public List<Invoice> all() {
        return null;
    }

    @Override
    public void save(Invoice inv) {

    }

    @Override
    public void close() {

    }
}
