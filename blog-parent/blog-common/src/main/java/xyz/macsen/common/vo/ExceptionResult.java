package xyz.macsen.common.vo;

import xyz.macsen.common.enums.ExceptionEnum;

import java.time.LocalDateTime;

public class ExceptionResult {
    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMessage();
        this.timestamp = LocalDateTime.now();
    }

    public ExceptionResult() {
    }

    public ExceptionResult(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
