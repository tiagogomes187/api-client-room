package com.github.tiagogomes187.saladereuniao.exception;

import lombok.Data;

import java.util.Date;

public @Data
class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

}
