package com.test.jmh.cache;

import com.test.jmh.cache.impl.GuavaCacheImpl;
import com.test.jmh.utils.RandomUtils;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public int iterations = 1000;
    public GuavaCacheImpl guavaCache;
    public String bigCacheKey;
    public String smallCacheKey;

    @Setup(Level.Iteration)
    public void setUp() {
        guavaCache = new GuavaCacheImpl();
        bigCacheKey = RandomUtils.getRandomString(200);
        smallCacheKey = RandomUtils.getRandomString();
        guavaCache.get(bigCacheKey);
        guavaCache.get(smallCacheKey);
    }
}
