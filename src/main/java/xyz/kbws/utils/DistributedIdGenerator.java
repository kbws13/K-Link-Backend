package xyz.kbws.utils;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import xyz.kbws.constant.RedissonConstants;

import javax.annotation.Resource;

/**
 * @author kbws
 * @date 2024/5/25
 * @description: 分布式 ID 生成器
 */
@Component
public class DistributedIdGenerator {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public Long generateDistributedId(String key) {
        return stringRedisTemplate.opsForValue().increment(RedissonConstants.SHORT_LINK_DISTRIBUTED_ID_KEY + key);
    }
}
