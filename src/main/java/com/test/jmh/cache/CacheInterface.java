package com.test.jmh.cache;

import com.test.jmh.entries.TestEntry;

import java.util.concurrent.ExecutionException;

public interface CacheInterface {

    TestEntry get(String key) throws ExecutionException;
}
