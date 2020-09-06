package org.kodluyoruz.trendyol.b.singleresponsibility.good;

public class SendSmsDTO {
    private String sender;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String message;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender.replaceAll("[+=*^% ]", ".");
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message.replaceAll("[+=*^%]", "-");
    }
}
