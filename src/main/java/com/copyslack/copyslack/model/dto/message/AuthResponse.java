package com.copyslack.copyslack.model.dto.message;

import org.springframework.http.HttpStatus;

import lombok.ToString;

@ToString
public class AuthResponse implements ApiResponse {
  public static final AuthResponse LARGE_NUMBER_OF_REQUESTS =
      new AuthResponse("Large Number Of Requests", "Try again later", 2001);

  private final String message;
  private final String description;
  private final int errorCode;

  private AuthResponse(String message, String description, int errorCode) {
    this.message = message;
    this.description = description;
    this.errorCode = errorCode;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public int getErrorCode() {
    return errorCode;
  }

  @Override
  public int getHttpStatus() {
    return HttpStatus.UNAUTHORIZED.value();
  }
}
