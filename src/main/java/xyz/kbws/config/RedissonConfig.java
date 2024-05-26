package xyz.kbws.config;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kbws
 * @date 2024/5/25
 * @description:
 */
@Configuration
public class RedissonConfig {

    @Value("${spring.redis.host}")
    private String redissonUrl;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.database}")
    private Integer database;

    @Bean
    public Redisson redisson() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://" + redissonUrl + ":" + port)
                .setDatabase(database);
        return (Redisson) Redisson.create(config);
    }
}
