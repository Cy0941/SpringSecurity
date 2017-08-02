package cn.cxy.spring.rpc.rmi.client.service.impl;

import cn.cxy.spring.rpc.rmi.client.service.ClientService;
import cn.cxy.spring.rpc.service.client.service.ServerService;
import cn.cxy.spring.security.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/8/1 21:56 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ServerService serverService;

    public Spitter findOne(long id) {
        return serverService.findOne(id);
    }
}
