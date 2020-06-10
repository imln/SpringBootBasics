package com.lngupta.springboot.basics.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
//@Getter
//@Setter
public class ResponseDTO<T> {
    private HttpStatus statusCode;
    private T data;

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseDTO(HttpStatus statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }
}
