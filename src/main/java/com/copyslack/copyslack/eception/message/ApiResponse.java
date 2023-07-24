package com.copyslack.copyslack.eception.message;

public interface ApiResponse {

  String getMessage();

  String getDescription();

  int getErrorCode();

  int getHttpStatus();
}
