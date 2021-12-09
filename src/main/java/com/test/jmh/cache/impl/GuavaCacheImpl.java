package com.test.jmh.cache.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.test.jmh.cache.CacheInterface;
import com.test.jmh.entries.TestEntry;
import java.time.Duration;

public class GuavaCacheImpl implements CacheInterface {

    private static final LoadingCache<String, TestEntry> authenticationCache;

    static {
        authenticationCache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(Duration.ofMinutes(1))
                .build(new CacheLoader<String, TestEntry>() {
                    @Override
                    public TestEntry load(String jwt) {
                        return new TestEntry();
                    }
                });
    }

    @Override
    public TestEntry get(String key) {
        try {
            return authenticationCache.get(key);
        }catch (Exception e){}
        return null;
    }
}
