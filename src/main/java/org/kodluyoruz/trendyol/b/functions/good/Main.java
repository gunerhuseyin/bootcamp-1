package org.kodluyoruz.trendyol.b.functions.good;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms();

        SendSmsDTO sendSmsDTO = new SendSmsDTO();

        sendSmsDTO.setName("Kodluyoruz");
        sendSmsDTO.setSurname("Bootcamp");
        sendSmsDTO.setSender("Trendyol");
        sendSmsDTO.setEmail("bootcamp@kodluyoruz.org");
        sendSmsDTO.setPhone("01234567890");
        sendSmsDTO.setMessage("Hello!");

        // Low number of arguments
        sms.Send(sendSmsDTO);


        /*
        Email email = new Email();
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer(1L, "name", "name@email.com", true);
        Customer customer2 = new Customer(2L, "name2", "name2@email.com",true);

        customers.add(customer1);
        customers.add(customer2);

        email.sendEmail(customers);
        */
    }
}
