package com.codingbee.tool_box.exceptions;

@SuppressWarnings("unused")
public class IncorrectDataException extends IllegalArgumentException{
    public IncorrectDataException(String message) {
        super("Incorrect data found or argument passed: " + message);
    }
}