package com.example.demo7.UserResponse;

public class ResponseDTO {
    private int statusCode;
    private String message;

    // Getters and Setters




    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }


    public ResponseDTO(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public ResponseDTO(int statusCode) {
        this.statusCode = statusCode;
    }

    public ResponseDTO(String message) {
        this.message = message;
    }
}








