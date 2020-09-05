package org.kodluyoruz.trendyol.e.errorhandling;

import org.kodluyoruz.trendyol.e.errorhandling.exception.SmsSendException;

public class Sms {

    public void sendSms() {
        try {
            // try to send sms
        } catch (Exception e) {
            throw new SmsSendException("Error occurred on send sms", e);
        }
    }
}
