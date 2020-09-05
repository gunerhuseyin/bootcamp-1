package org.kodluyoruz.trendyol.e.errorhandling.exception;

public class SmsSendException extends RuntimeException {

    public SmsSendException(String message, Exception exception) {
        super(message, exception);
    }
}
