package org.kodluyoruz.trendyol.b.functions.bad;

import java.util.List;

public class Email {

    // Functions should do one thing!!!
    public void sendEmail(List<Customer> customers) {
        for (Customer customer : customers) {
            Customer customerRecord = customer.findOne(customer.getId());
            if (customerRecord.isActive()) {
                // send email process
                System.out.printf("Send email to %s %s \n", customer.getName());
            }
        }
    }
}
