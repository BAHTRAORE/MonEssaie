package org.example.repository;


import org.example.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    private static List<Invoice> invoices = new ArrayList<Invoice>();
    public void create(Invoice invoice){

        invoices.add(invoice);
        System.out.println(" votre numero: " +invoice.getNumber()+ "votre nom et" +invoice.getName());
    }
}
