package com.test.jmh.redis.clients;

import com.test.jmh.redis.RedisFactory;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

public class Jedis implements RedisFactory<String, String> {

    private static final JedisCluster cluster;

    static {
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("10.162.186.40", 7001));
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(10000);
        config.setMaxIdle(500);

        cluster = new JedisCluster(nodes, config);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                cluster.close();
            }
        });
    }

    public static JedisCluster getCluster() {
        return cluster;
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
