package cn.cxy.spring.rpc.rmi.client.config;

import cn.cxy.spring.rpc.rmi.client.service.ServerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 23:12 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
public class ClientConfig {

    @Bean
    public ServerService myService(){
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://localhost/ServerService");
        factoryBean.setServiceInterface(ServerService.class);
        return (ServerService) factoryBean.getObject();
    }

}
