package com.test.jmh.redis.clients;

import com.test.jmh.redis.RedisFactory;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonClientTest implements RedisFactory {

    private final RedissonClient redisson;

    public RedissonClientTest() {
        Config config = new Config();
        config.useClusterServers()
                .addNodeAddress("redis://10.162.186.40:7001");

        redisson = Redisson.create(config);
    }

    @Override
    public void set(String key, String value) {
        redisson.getBucket(key).set(value);
    }

    @Override
    public String get(String key) {
        return redisson.getBucket(key).get().toString();
    }
}
