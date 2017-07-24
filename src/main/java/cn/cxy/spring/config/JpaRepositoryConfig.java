package cn.cxy.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/21 18:36 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableJpaRepositories(basePackages = {"cn.cxy.spring.config"},repositoryImplementationPostfix = "Helper")
public class JpaRepositoryConfig {
}
