package com.copyslack.copyslack.cache.ratelimiter;

import java.time.Duration;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RateLimiterCacheImpl implements RateLimiterCache {

  private final RedisTemplate<String, Integer> redisTemplate;

  @Override
  public Integer getRequests(String ip) {
    Integer value = redisTemplate.opsForValue().get(KEY_PREFIX + ip);
    if (value == null) {
      return 0;
    }
    return value;
  }

  @Override
  public void incrementRequest(String ip) {
    redisTemplate.opsForValue().increment(KEY_PREFIX + ip);
    Long expire = redisTemplate.getExpire(KEY_PREFIX + ip);
    if (expire != null && expire < 0) {
      redisTemplate.expire(KEY_PREFIX + ip, Duration.ofMinutes(1));
    }
  }

  private static final String KEY_PREFIX = "rate_limiter_";
}
