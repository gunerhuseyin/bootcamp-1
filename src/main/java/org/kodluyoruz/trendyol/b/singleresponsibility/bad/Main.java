package org.kodluyoruz.trendyol.b.singleresponsibility.bad;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms();
        AtomicInteger counter = new AtomicInteger(1);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hellooooooo!", 1000, counter);

        counter.set(0);

        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hellooooooo!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hellooooooo!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!", 1000, counter);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!", 1000, counter);
    }
}
