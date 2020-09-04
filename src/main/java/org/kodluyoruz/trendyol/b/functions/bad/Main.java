package org.kodluyoruz.trendyol.b.functions.bad;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms();
        AtomicInteger counter = new AtomicInteger(1);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!");



        /*
        Email email = new Email();
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer(1L, "name", "name@email.com", true);
        Customer customer2 = new Customer(2L, "name2", "name2@email.com", true);

        customers.add(customer1);
        customers.add(customer2);

        email.sendEmail(customers);
        */

    }
}
