package org.kodluyoruz.trendyol.b.singleresponsibility.bad;

import java.util.concurrent.atomic.AtomicInteger;

public class Sms {
    public void Send(String sender, String name, String surname, String email, String phone, String message, int quota, AtomicInteger counter) {
        if (counter.get() + 1 > quota) {
            System.out.printf("Exceed quota. Quota: %d \n", quota);
        } else {
            System.out.printf("Send sms to %s %s (%s) from %s. Message: %s, Counter: %d \n", sender, name, surname, phone, message, counter.get());
            counter.set(counter.incrementAndGet());
        }

    }
}
