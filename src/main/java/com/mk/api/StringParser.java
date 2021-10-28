package com.mk.api;

import com.mk.api.model.StringResponse;

public class StringParser {
    public static StringResponse getStringInformation(String parameter) {
        StringResponse stringResponse = new StringResponse(parameter);
        for (int i = 0; i < parameter.length(); i++) {
            if (Character.isDigit(parameter.charAt(i))) {
                stringResponse.addDigit();
            } else if (Character.isUpperCase(parameter.charAt(i))) {
                stringResponse.addUpperCase();
            } else if (Character.isLowerCase(parameter.charAt(i))) {
                stringResponse.addLowerCase();
            } else if (Character.isWhitespace(parameter.charAt(i))) {
                stringResponse.addWhitespace();
            } else if (String.valueOf(parameter.charAt(i)).matches("[^A-Za-z0-9 ]")) {
                stringResponse.addSpecialCharacter();
            }
        }
        return stringResponse;
    }
}
