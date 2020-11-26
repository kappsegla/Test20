package invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDaoFake implements InvoiceDao{

    private final List<Invoice> invoices = new ArrayList<>();

    @Override
    public List<Invoice> all() {
        return invoices;
    }

    @Override
    public void save(Invoice inv) {
        invoices.add(inv);
    }

    @Override
    public void close() {

    }
}
