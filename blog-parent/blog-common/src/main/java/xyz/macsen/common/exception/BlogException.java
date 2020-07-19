package xyz.macsen.common.exception;

import xyz.macsen.common.enums.ExceptionEnum;

public class BlogException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public BlogException() {
    }

    public BlogException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
