package org.kodluyoruz.trendyol.d.openclosed.bad2;

public class ApplyDiscount {

    public Double calculateAmount(Customer customer, Double amount) {
        switch (customer.getMembershipType()) {
            case STANDARD:
                return amount - 2;
            case PREMIUM:
                return amount - 10;
        }

        return amount;
    }
}
