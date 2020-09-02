package org.kodluyoruz.trendyol.b.functions.good;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms();
        AtomicInteger counter = new AtomicInteger(1);

        SendSmsDTO sendSmsDTO = new SendSmsDTO();

        sendSmsDTO.setName("Kodluyoruz");
        sendSmsDTO.setSurname("Bootcamp");
        sendSmsDTO.setSender("Trendyol");
        sendSmsDTO.setEmail("bootcamp@kodluyoruz.org");
        sendSmsDTO.setPhone("01234567890");
        sendSmsDTO.setMessage("Hello!");

        sms.Send(sendSmsDTO);
    }
}
