package org.kodluyoruz.trendyol.b.functions.good;

import java.util.List;

public class Email {

    public void sendEmail(List<Customer> customers) {
        for (Customer customer : customers) {
            if (isCustomerActive(customer)) {
                // send email process
                System.out.printf("Send email to %s %s \n", customer.getName());
            }
        }
    }

    private boolean isCustomerActive(Customer customer) {
        Customer customerRecord = customer.findOne(customer.getId());
        return customerRecord.isActive();
    }
}
