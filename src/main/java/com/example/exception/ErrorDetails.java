package com.example.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDetails {
    private Date timestamp;
    private int status;
    private String message;
    private String details;

    public ErrorDetails(int status, String message, String details) {
        super();
        this.timestamp = new Date();
        this.status = status;
        this.message = message;
        this.details = details;
    }


}
