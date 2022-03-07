package com.test.jmh.redis;

import java.util.Map;

public interface RedisFactory<K, V> {

    void set(K key, V value);

    void hset(String prefix, K key, V value);

    void hset(String prefix, Map<K, V> keyValueMap);

    V get(K key);
}
