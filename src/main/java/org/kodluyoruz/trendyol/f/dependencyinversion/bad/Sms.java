package org.kodluyoruz.trendyol.f.dependencyinversion.bad;

public class Sms {
    public void SendSms(String message) {
        System.out.printf("Send sms. Message: %s \n", message);
    }
}
