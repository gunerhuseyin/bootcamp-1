package org.kodluyoruz.trendyol.b.functions.bad;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private boolean active;

    public Customer(Long id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Customer findOne(Long id) {
        return new Customer(id, "name", "name@email.com", true);
    }
}
