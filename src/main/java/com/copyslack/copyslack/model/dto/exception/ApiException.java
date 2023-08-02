package com.copyslack.copyslack.model.dto.exception;

import com.copyslack.copyslack.model.dto.message.ApiResponse;
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
