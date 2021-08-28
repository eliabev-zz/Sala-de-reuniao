package com.digital.crud.saladereuniao.saladereuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFounException extends Exception {

    private static final long serialVersionUID= 1L;
    public ResourceNotFounException(String message) {
        super(message);
    }

}
