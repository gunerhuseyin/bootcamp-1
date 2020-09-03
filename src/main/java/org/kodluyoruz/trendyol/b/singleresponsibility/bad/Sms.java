package org.kodluyoruz.trendyol.b.singleresponsibility.bad;

import java.util.concurrent.atomic.AtomicInteger;

public class Sms {
    public void Send(String sender, String name, String surname, String email, String phone, String message, int quota, AtomicInteger counter) {

        message = message.replaceAll("[+=*^%]", "-");
        sender = sender.replaceAll("[+=*^% ]", ".");

        if (counter.get() + 1 > quota) {
            System.out.printf("Exceed quota. Quota: %d \n", quota);
        } else if (message.isEmpty()) {
            System.out.printf("Cannot send message because it is empty. Message: %s \n", message);
        } else if (message.contains("***")) {
            System.out.printf("Message cannot be sent because it contains unacceptable words (***). Message: %s \n", message);
        } else if (message.length() > 200) {
            System.out.printf("Cannot send message because it exceeds 200 characters. Message: %s \n", message);
        } else if (message.length() < 10) {
            System.out.printf("Cannot send message because it less than 10 characters. Message: %s \n", message);
        } else if (!email.contains("@") || !email.contains(".")) {
            System.out.printf("Message cannot be sent because the e-mail is not in the correct format. Email: %s \n", email);
        } else if (phone.length() != 11) {
            System.out.printf("Message cannot be sent because the phone length is not equal to 11. Email: %s \n", email);
        } else {
            System.out.printf("Send sms to %s %s (%s) from %s. Message: %s, Counter: %d \n", sender, name, surname, phone, message, counter.get());
            counter.set(counter.incrementAndGet());
        }

    }
}
