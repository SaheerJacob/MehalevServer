package com.SaheerJeries.mehalev.errors.custom;

public class ResultsNotFoundException extends RuntimeException{

    public ResultsNotFoundException(String message){
        super(message);
    }
}
