package com.study.ch21;

import lombok.Getter;

import java.util.Map;
@Getter
public class ResponseException extends RuntimeException { //예외를 만드는 클래스
    private Map<String, Object> errorMap;
    ResponseException (String message) {
        super(message);
    }
    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
