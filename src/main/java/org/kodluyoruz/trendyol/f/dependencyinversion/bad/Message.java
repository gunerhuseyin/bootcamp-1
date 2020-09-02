package org.kodluyoruz.trendyol.f.dependencyinversion.bad;

public class Message {
    private Sms sms = new Sms();
    private Email email = new Email();

    public void Send(String message) {
        sms.SendSms(message);
        email.SendEmail(message);
    }

}
