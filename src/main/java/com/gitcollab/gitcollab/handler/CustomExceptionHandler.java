package com.gitcollab.gitcollab.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(WebClientResponseException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Exception contentNotFound(Exception ex, WebRequest request) {
        return ex;
    }

}
