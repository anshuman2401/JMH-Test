package com.test.jmh.redis.clients;

import com.test.jmh.redis.RedisFactory;
import io.lettuce.core.cluster.RedisClusterClient;
import io.lettuce.core.cluster.api.StatefulRedisClusterConnection;
import io.lettuce.core.cluster.api.sync.RedisAdvancedClusterCommands;

public class Lettuce implements RedisFactory {

    private static StatefulRedisClusterConnection<String, String> cluster = null;

    public Lettuce () {
        try {
            RedisClusterClient redisClient = RedisClusterClient.create("redis://10.162.186.40:7001");
            cluster = redisClient.connect();
        }catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static RedisAdvancedClusterCommands<String, String> getCluster() {
        return cluster.sync();
    }

    @Override
    public void set(String key, String value) {
        getCluster().set(key, value);
    }

    @Override
    public String get(String key) {
        return getCluster().get(key);
    }
}
