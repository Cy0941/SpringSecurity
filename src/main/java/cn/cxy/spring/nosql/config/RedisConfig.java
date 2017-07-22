package cn.cxy.spring.nosql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/22 15:37 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory factory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("redis-server");
        factory.setPort(6379);
        factory.setPassword("password");
        //TODO other configs
        return factory;
    }

    @Bean
    public RedisTemplate redisTemplate(){
        RedisTemplate template = new RedisTemplate();
        template.setConnectionFactory(factory());
        //TODO other configs & StringRedisTemplate 配置同
        template.setEnableTransactionSupport(true);
        return template;
    }
}
