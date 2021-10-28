package com.mk.api.model;

public class StringResponse {
    private String parameter;
    private int length;
    private Long digits;
    private Long upperCase;
    private Long lowerCase;
    private Long whitespace;
    private Long specialCharacters;

    public StringResponse(String parameter) {
        this.parameter = parameter;
        this.length = parameter.length();
        this.digits = 0L;
        this.upperCase = 0L;
        this.lowerCase = 0L;
        this.whitespace = 0L;
        this.specialCharacters = 0L;
    }

    public void addDigit() {
        this.digits++;
    }

    public void addUpperCase() {
        this.upperCase++;
    }

    public void addLowerCase() {
        this.lowerCase++;
    }

    public void addWhitespace() {
        this.whitespace++;
    }

    public void addSpecialCharacter() {
        this.specialCharacters++;
    }
}
