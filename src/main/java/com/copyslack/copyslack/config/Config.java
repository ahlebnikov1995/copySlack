package com.copyslack.copyslack.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class Config {

  @Bean
  @Qualifier("rateLimiter")
  public RedisTemplate<String, Integer> rateLimiterRedisTemplate(
      RedisConnectionFactory connectionFactory) {
    final RedisTemplate<String, Integer> template = new RedisTemplate<>();
    template.setConnectionFactory(connectionFactory);
    template.setKeySerializer(new StringRedisSerializer());
    template.setHashValueSerializer(new GenericToStringSerializer<>(Integer.class));
    template.setValueSerializer(new GenericToStringSerializer<>(Integer.class));
    return template;
  }
}
