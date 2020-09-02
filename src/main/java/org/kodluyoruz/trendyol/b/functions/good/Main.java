package org.kodluyoruz.trendyol.b.functions.good;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms();
        AtomicInteger counter = new AtomicInteger(1);
        sms.Send("Trendyol", "Kodluyoruz", "Bootcamp", "bootcamp@kodluyoruz.org", "01234567890", "Hello!");
    }
}
