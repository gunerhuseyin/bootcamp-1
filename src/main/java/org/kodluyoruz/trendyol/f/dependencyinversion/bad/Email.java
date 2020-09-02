package org.kodluyoruz.trendyol.f.dependencyinversion.bad;

public class Email {
    public void SendEmail(String message) {
        System.out.printf("Send sms. Message: %s \n", message);
    }
}
