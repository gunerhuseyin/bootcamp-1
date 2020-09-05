package org.kodluyoruz.trendyol.d.openclosed.bad2;

public class Main {
    public static void main(String[] args) {
        Double amount = 75D;

        ApplyDiscount applyDiscount = new ApplyDiscount();

        Customer customer1 = new Customer(1L, "name-1", "surname-1", MembershipType.STANDARD);
        Customer customer2 = new Customer(2L, "name-2", "surname-2", MembershipType.PREMIUM);

        System.out.println("Applied discount for standard customer: " + applyDiscount.calculateAmount(customer1, amount));
        System.out.println("Applied discount for premium customer: " + applyDiscount.calculateAmount(customer2, amount));
    }
}
