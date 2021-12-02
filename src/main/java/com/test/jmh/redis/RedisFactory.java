package com.test.jmh.redis;

public interface RedisFactory<K, V> {

    void set(K key, V value);

    V get(K key);
}
