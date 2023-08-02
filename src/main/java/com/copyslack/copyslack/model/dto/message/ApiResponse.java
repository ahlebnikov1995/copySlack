package com.copyslack.copyslack.model.dto.message;

public interface ApiResponse {

  String getMessage();

  String getDescription();

  int getErrorCode();

  int getHttpStatus();
}
