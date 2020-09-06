package org.kodluyoruz.trendyol.b.singleresponsibility.good;


public class Sms {
    public void Send(SendSmsDTO sms) {
        System.out.printf("Send sms to %s %s (%s) from %s. Message: %s", sms.getSender(), sms.getName(), sms.getSurname(), sms.getPhone(), sms.getMessage());
    }

    public boolean validateMessage(String message) {
        if (message.isEmpty()) {
            return false;
        } else if (message.contains("***")) {
            return false;
        } else return message.length() <= 200 && message.length() >= 10;
    }

    public boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public boolean validatePhone(String phone) {
        return phone.length() == 11;
    }
}
