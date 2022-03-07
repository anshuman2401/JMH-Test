package com.test.jmh.redis.clients;

import com.test.jmh.redis.RedisFactory;

import java.util.Map;

public class RedissonClientTest implements RedisFactory<String, Object> {

    @Override
    public void set(String key, Object value) {
        RedissonClientFactory.getClient().getBucket(key).set(value);
    }

    @Override
    public void hset(String prefix, String key, Object value) {

    }

    @Override
    public void hset(String prefix, Map<String, Object> keyValueMap) {

    }

    @Override
    public Object get(String key) {
        return RedissonClientFactory.getClient().getBucket(key).get();
    }
}
