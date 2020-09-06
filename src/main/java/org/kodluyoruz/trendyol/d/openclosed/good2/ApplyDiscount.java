package org.kodluyoruz.trendyol.d.openclosed.good2;

public class ApplyDiscount {

    public Double calculateAmount(Customer customer, Double amount) {
        return customer.getMembershipType().calculateAmount(amount);
    }
}
