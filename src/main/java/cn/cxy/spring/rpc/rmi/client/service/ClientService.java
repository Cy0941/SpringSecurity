package cn.cxy.spring.rpc.rmi.client.service;

import cn.cxy.spring.security.model.Spitter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/8/1 21:57 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface ClientService {

    Spitter findOne(long id);

}
