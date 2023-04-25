package org.example;

import org.example.entity.Invoice;
import org.example.sercive.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Quelle est votre nom" );
        Scanner sc = new Scanner(System.in);
         String ajout =  sc.nextLine();

         Invoice invoice = new Invoice();
         invoice.setName(ajout);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}
