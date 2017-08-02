package cn.cxy.spring.rpc.hessian_burlap.server.config;

import cn.cxy.spring.rpc.service.server.ServerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/8/1 22:06 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
public class Hessian_BurlapConfig {

    @Bean
    public HessianServiceExporter serviceExporter(ServerService serverService){
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(serverService);
        exporter.setServiceInterface(ServerService.class);
        //TODO 不需要设置 serviceName 属性  --  Hessian 没有注册表
        return exporter;
    }

    @Bean
    public BurlapServiceExporter burlapServiceExporter(ServerService serverService){
        BurlapServiceExporter exporter = new BurlapServiceExporter();
        exporter.setService(serverService);
        exporter.setServiceInterface(ServerService.class);
        return exporter;
    }

}
