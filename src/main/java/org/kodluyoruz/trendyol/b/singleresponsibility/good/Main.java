package org.kodluyoruz.trendyol.b.singleresponsibility.good;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 2000; i++) {
            Sms sms = new Sms();
            SendSmsDTO sendSmsDTO = new SendSmsDTO();

            sendSmsDTO.setName("Kodluyoruz");
            sendSmsDTO.setSurname("Bootcamp");
            sendSmsDTO.setSender("Trendyol");
            sendSmsDTO.setEmail("bootcamp@kodluyoruz.org");
            sendSmsDTO.setPhone("01234567890");
            sendSmsDTO.setMessage("Hello000000000!");

            if (!sms.validateMessage(sendSmsDTO.getMessage())) {
                System.out.println("validate message error");
                return;
            }

            if (!sms.validateEmail(sendSmsDTO.getEmail())) {
                System.out.println("validate email error");
                return;
            }

            if (!sms.validatePhone(sendSmsDTO.getPhone())) {
                System.out.println("validate phone error");
                return;
            }

            if (counter > 1000) {
                System.out.println("exceed counter");
                return;
            }

            sms.Send(sendSmsDTO);

            counter++;

        }

    }
}
