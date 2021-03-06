package com.SaheerJeries.mehalev.errors.custom;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralError {
    private HttpStatus status;
    private String message;
}
