package org.kodluyoruz.trendyol.d.openclosed.good2;

public class PremiumMembershipType implements MembershipType {
    @Override
    public double calculateAmount(Double amount) {
        return amount - 10;
    }
}
