package cn.cxy.spring.nosql.config;

import com.mongodb.Mongo;
import com.mongodb.MongoCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/22 11:03 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableMongoRepositories(basePackages = "cn.cxy.spring")
public class MongoConfig {

    @Autowired
    private Mongo mongo;
    @Autowired
    private Environment environment;

    /**
     * MongoClient
     *
     * @return
     */
    @Bean
    public MongoClientFactoryBean factoryBean() {
        MongoClientFactoryBean factory = new MongoClientFactoryBean();
        factory.setHost("localhost");
        MongoCredential credential = MongoCredential.createCredential(environment.getProperty("mongo.username"),"OrdersDB",environment.getProperty("mongo.password").toCharArray());
        factory.setCredentials(new MongoCredential[]{credential});
        return factory;
    }

    /**
     * MongoTemplate
     * @return
     */
    @Bean
    public MongoOperations mongoTemplate() {
        return new MongoTemplate(mongo, "OrderDB");
    }

}
