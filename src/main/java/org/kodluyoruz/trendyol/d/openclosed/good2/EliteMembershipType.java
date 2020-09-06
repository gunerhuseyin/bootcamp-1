package org.kodluyoruz.trendyol.d.openclosed.good2;

public class EliteMembershipType implements MembershipType {
    @Override
    public double calculateAmount(Double amount) {
        return amount - 15;
    }
}
