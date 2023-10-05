package com.kingspanapi.kingspanbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UseNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UseNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandle(UseNotFoundException ex){
        Map<String,String> error = new HashMap<>();
        error.put("mensagem",ex.getMessage());
        return error;
    }

}
