package org.kodluyoruz.trendyol.d.openclosed.good2;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private MembershipType membershipType;

    public Customer(Long id, String name, String surname, MembershipType membershipType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.membershipType = membershipType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }
}
