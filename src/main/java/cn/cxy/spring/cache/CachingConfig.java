package cn.cxy.spring.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/24 18:56 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableCaching // 启用缓存
public class CachingConfig {

    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * cxy 原理：@EnableCaching 与命名空间 - 创建一个切面 aspect 并触发 Spring 缓存注解的切点 pointcut
     * 声明缓存管理器
     * TODO XML - cache 命名空间  --  <cache:annotation-driven/>
     * @return
     */
    /*@Bean
    public CacheManager cacheManager(){
        return new ConcurrentMapCacheManager(); //基于内存
    }*/

    /**
     * 多缓存管理配置
     * @return
     */
    @Bean
    public CompositeCacheManager compositeCacheManager(){
        CompositeCacheManager compositeCacheManager = new CompositeCacheManager();
        List<CacheManager> managerList = new ArrayList<CacheManager>();
        //cxy 按照 List 中声明顺序进行迭代
        managerList.add(new ConcurrentMapCacheManager());
        //TODO
        compositeCacheManager.setCacheManagers(managerList);
        return compositeCacheManager;
    }

    @Bean
    public RedisCacheManager redisCacheManager(){
        return new RedisCacheManager(redisTemplate);
    }

    /**
     * 配置EhCache
     * @return
     */
    @Bean
    public EhCacheManagerFactoryBean ehcache() {
        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        factoryBean.setConfigLocation(null);
        return factoryBean;
    }
    @Bean
    public EhCacheCacheManager cacheManager(net.sf.ehcache.CacheManager cm) {
        return new EhCacheCacheManager(cm);
    }
}
