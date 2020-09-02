package org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel;

public class Sms implements Channel {

    @Override
    public void Send(String message) {
        System.out.printf("Send sms. Message: %s \n", message);
    }
}
