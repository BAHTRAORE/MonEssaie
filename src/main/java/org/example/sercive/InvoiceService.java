package org.example.sercive;


import org.example.entity.Invoice;
import org.example.repository.InvoiceRepository;

import java.util.Scanner;

public class InvoiceService {

    private static long lastNum = 0L;

    InvoiceRepository invoiceRepository = new InvoiceRepository();
    public void createInvoice(Invoice invoice){
       invoice.setNumber(String.valueOf(++lastNum));
       invoiceRepository.create(invoice);





    }

}
