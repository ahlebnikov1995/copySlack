package com.copyslack.copyslack.eception;

import com.copyslack.copyslack.eception.message.ApiResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class ApiException extends RuntimeException {
  @JsonProperty("result")
  @Getter
  @Setter
  protected ApiResponse response;

  @Override
  public String getMessage() {
    return response != null ? response.toString() : "";
  }

  @Override
  public String getLocalizedMessage() {
    return response != null ? response.toString() : "";
  }
}
