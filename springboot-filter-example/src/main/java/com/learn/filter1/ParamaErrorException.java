package com.learn.filter1;

public class ParamaErrorException extends RuntimeException {

    public ParamaErrorException() {
    }

    public ParamaErrorException(String message) {
        super(message);
    }
}
