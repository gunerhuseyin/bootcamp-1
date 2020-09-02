package org.kodluyoruz.trendyol.f.dependencyinversion.good;

import com.sun.tools.javac.util.List;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.Sender;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Email;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Sms;


public class Main {
    public static void main(String[] args) {
        Sender sender = new Sender(List.of(new Sms(), new Email()));

        sender.Send("Hello Kodluyoruz Bootcamp!");
    }
}
