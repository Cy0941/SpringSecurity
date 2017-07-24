package cn.cxy.spring.config;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/21 19:18 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableMongoRepositories(basePackages = "cn.cxy.spring")
public class MongoDBConfig {

    @Autowired
    private Mongo mongo;

    /**
     * MongoDB Client - 便于访问 MongoDB 数据库
     *
     * @return
     */
    @Bean
    public MongoFactoryBean mongoDbFactory() {
        MongoFactoryBean factory = new MongoFactoryBean();
        factory.setHost("localhost");
        return factory;
    }

    /**
     * MongoDB Template  --  即使不直接使用 Template 实现功能，但自动化生成 Repository 的功能在底层使用了此类
     * @return
     */
    @Bean
    public MongoOperations mongoOperations() {
        return new MongoTemplate(mongo, "OrdersDB");
    }

}
