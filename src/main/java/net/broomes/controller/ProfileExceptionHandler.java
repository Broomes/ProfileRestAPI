package net.broomes.controller;

import net.broomes.exception.ErrorResponse;
import net.broomes.exception.ProfileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ProfileExceptionHandler {

    public ResponseEntity<ErrorResponse> handleException(ProfileNotFoundException exc){

        ErrorResponse error = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErrorResponse> handleException(Exception exc){

        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
