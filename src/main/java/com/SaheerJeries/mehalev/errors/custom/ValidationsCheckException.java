package com.SaheerJeries.mehalev.errors.custom;

import java.util.Map;

public class ValidationsCheckException extends RuntimeException {

    public ValidationsCheckException(Map<String, String> message) {
        super(message.toString().replace("=",":"));
    }

}
