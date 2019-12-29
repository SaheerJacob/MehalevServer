package com.SaheerJeries.mehalev.errors.custom;

public class InvalidCredentials extends RuntimeException{
    public InvalidCredentials(String message) {
        super(message);
    }
}
