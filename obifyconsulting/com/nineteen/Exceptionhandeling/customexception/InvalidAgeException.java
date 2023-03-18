package com.obifyconsulting.com.nineteen.Exceptionhandeling.customexception;

public class InvalidAgeException extends Exception {
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private  String errorCode;
    InvalidAgeException(String s)
    {
        super(s);
    }

}
