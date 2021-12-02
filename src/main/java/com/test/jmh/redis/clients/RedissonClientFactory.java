package com.test.jmh.redis.clients;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonClientFactory {

    private static volatile RedissonClientFactory INSTANCE;
    private static RedissonClient redisson;

    private RedissonClientFactory(){}

    public static RedissonClientFactory initialize() {
        if (INSTANCE == null) {
            synchronized (RedissonClientFactory.class) {
                INSTANCE = new RedissonClientFactory();
                Config config = new Config();
                config.useClusterServers()
                        .addNodeAddress("redis://10.162.186.40:7001");
                redisson = Redisson.create(config);
            }
        }

        return INSTANCE;
    }

    public static RedissonClient getClient() {
        if (INSTANCE == null)
            initialize();
        return redisson;
    }
}
