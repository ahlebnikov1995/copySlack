package com.copyslack.copyslack.eception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.copyslack.copyslack.eception.ApiException;
import com.copyslack.copyslack.eception.message.ApiResponse;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = {ApiException.class})
  protected ResponseEntity<ApiResponse> apiExceptionHandler(ApiException ex) {
    log.error("Caught ApiException: ", ex);
    return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
  }
}
