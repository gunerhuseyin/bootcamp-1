package org.kodluyoruz.trendyol.b.functions.good;

public class Sms {
    public void Send(SendSmsDTO sendSmsDTO) {
        System.out.printf("Send sms to %s %s (%s) from %s. Message: %s \n", sendSmsDTO.getSender(), sendSmsDTO.getName(), sendSmsDTO.getSurname(), sendSmsDTO.getPhone(), sendSmsDTO.getMessage());
    }
}
