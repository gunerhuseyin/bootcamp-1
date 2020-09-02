package org.kodluyoruz.trendyol.b.functions.bad;

public class Sms {
    public void Send(String sender, String name, String surname, String email, String phone, String message) {
        System.out.printf("Send sms to %s %s (%s) from %s. Message: %s, Counter: %d \n", sender, name, surname, phone, message);
    }
}
