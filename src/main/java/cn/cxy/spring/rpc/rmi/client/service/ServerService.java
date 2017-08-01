package cn.cxy.spring.rpc.rmi.client.service;

import cn.cxy.spring.security.model.Spitter;
import org.springframework.stereotype.Repository;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/27 22:46 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Repository
public interface ServerService {

    Spitter findOne(long id);

}
