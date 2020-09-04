package org.kodluyoruz.trendyol.f.dependencyinversion.good;

import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.Sender;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Email;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Sms;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Sender sender = new Sender(Arrays.asList(new Sms(), new Email()));

        sender.Send("Hello Kodluyoruz Bootcamp!");
    }
}
