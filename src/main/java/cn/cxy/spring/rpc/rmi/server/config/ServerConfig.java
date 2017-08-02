package cn.cxy.spring.rpc.rmi.server.config;

import cn.cxy.spring.rpc.service.server.ServerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 22:48 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Configuration
public class ServerConfig {

    @Bean
    public RmiServiceExporter serviceExporter(ServerService serverService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(serverService);
        exporter.setServiceName("serverService");
        exporter.setServiceInterface(ServerService.class);
        return exporter;
    }

}
