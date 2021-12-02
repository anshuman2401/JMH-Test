package com.test.jmh.redis;

public interface RedisFactory {

    void set(String key, String value);

    String get(String key);
}
