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

    /**
     * 通过代理对象获取代理接口并转化为本地接口
     * fixme 待测试
     * @return
     */
    @Bean
    public ServerService myService(){
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://localhost/ServerService");
        factoryBean.setServiceInterface(ServerService.class);
        //fixme
        return (ServerService) factoryBean.getObject();
    }

}
