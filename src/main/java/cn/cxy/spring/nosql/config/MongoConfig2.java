package cn.cxy.spring.nosql.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/22 14:19 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableMongoRepositories("cn.cxy.spring")
public class MongoConfig2 extends AbstractMongoConfiguration {
    protected String getDatabaseName() {
        return "OrderDB";
    }

    public Mongo mongo() throws Exception {
        return new MongoClient();
    }
}
