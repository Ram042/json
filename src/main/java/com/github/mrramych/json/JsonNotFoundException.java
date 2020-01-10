package com.github.mrramych.json;

public class JsonNotFoundException extends RuntimeException {

    public JsonNotFoundException() {
        super();
    }

    public JsonNotFoundException(String message) {
        super(message);
    }

    public JsonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonNotFoundException(Throwable cause) {
        super(cause);
    }
}