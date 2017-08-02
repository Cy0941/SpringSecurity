package cn.cxy.spring.rpc.hessian_burlap.client;

import cn.cxy.spring.rpc.service.client.service.ServerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/8/1 22:29 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
public class ClientConfig {

    @Bean
    public ServerService hessianProxyFactoryBean() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceInterface(ServerService.class);
        factory.setServiceUrl("remote url");
        return (ServerService) factory.getObject();
    }

    @Bean
    public ServerService burlapProxyFactoryBean() {
        BurlapProxyFactoryBean factory = new BurlapProxyFactoryBean();
        factory.setServiceInterface(ServerService.class);
        factory.setServiceUrl("remote url");
        return (ServerService) factory.getObject();
    }

}
