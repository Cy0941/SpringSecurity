package cn.cxy.spring.rpc.rmi.client.test;

import cn.cxy.spring.rpc.rmi.client.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Service;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 23:16 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Service
public class TestServiceImpl {

    @Autowired
    private ServerService rmiProxyFactoryBean;

}
