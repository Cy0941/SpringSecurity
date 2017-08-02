package cn.cxy.spring.rpc.service.server;

import cn.cxy.spring.security.model.Spitter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 22:46 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface ServerService {

    Spitter findOne(long id);

}
