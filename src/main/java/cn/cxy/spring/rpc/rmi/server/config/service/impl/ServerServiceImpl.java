package cn.cxy.spring.rpc.rmi.server.config.service.impl;

import cn.cxy.spring.rpc.rmi.server.config.service.ServerService;
import cn.cxy.spring.security.model.Spitter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 22:47 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Service
@Transactional
public class ServerServiceImpl implements ServerService {

    public Spitter findOne(long id) {
        return null;
    }
}
