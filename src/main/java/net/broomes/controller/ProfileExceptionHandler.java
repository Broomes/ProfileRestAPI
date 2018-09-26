package net.broomes.controller;

import net.broomes.exception.ProfileErrorResponse;
import net.broomes.exception.ProfileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProfileExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ProfileErrorResponse> handleException(ProfileNotFoundException exc){

        ProfileErrorResponse error = new ProfileErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ProfileErrorResponse> handleException(Exception exc){

        ProfileErrorResponse error = new ProfileErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
