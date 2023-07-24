package com.copyslack.copyslack.cache.ratelimiter;

public interface RateLimiterCache {
  Integer getRequests(String ip);

  void incrementRequest(String ip);
}
