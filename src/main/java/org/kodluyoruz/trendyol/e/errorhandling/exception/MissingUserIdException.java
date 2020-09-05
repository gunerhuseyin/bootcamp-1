package org.kodluyoruz.trendyol.e.errorhandling.exception;

public class MissingUserIdException extends RuntimeException {

    public MissingUserIdException(String message) {
        super(message);
    }
}
