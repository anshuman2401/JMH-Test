package com.test.jmh.redis;

public interface RedisFactory<K, V> {

    void set(K key, V value);

    void hset(String prefix, K key, V value);

    V get(K key);
}
