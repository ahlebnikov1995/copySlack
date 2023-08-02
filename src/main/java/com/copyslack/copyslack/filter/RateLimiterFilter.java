package com.copyslack.copyslack.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.copyslack.copyslack.cache.ratelimiter.RateLimiterCache;
import com.copyslack.copyslack.model.dto.message.AuthResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Component
@Order(100)
@RequiredArgsConstructor
public class RateLimiterFilter extends OncePerRequestFilter {

  private final RateLimiterCache rateLimiterCache;
  private final ObjectMapper mapper;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {
    String ip = request.getRemoteAddr();

    Integer count = rateLimiterCache.getRequests(ip);
    if (count != null && count <= 10) {
      rateLimiterCache.incrementRequest(ip);
      filterChain.doFilter(request, response);
    } else {
      response.setStatus(HttpStatus.OK.value());
      response.getWriter().write(mapper.writeValueAsString(AuthResponse.LARGE_NUMBER_OF_REQUESTS));
    }
  }
}
