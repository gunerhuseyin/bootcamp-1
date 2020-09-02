package org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel;

public class Email implements Channel {

    @Override
    public void Send(String message) {
        System.out.printf("Send email. Message: %s \n", message);
    }
}
