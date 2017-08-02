package cn.cxy.spring.rpc.service.server.impl;

import cn.cxy.spring.rpc.service.server.HessianService;
import com.caucho.hessian.server.HessianServlet;
import org.springframework.stereotype.Service;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/8/1 22:53 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Service
public class HessianServiceImpl extends HessianServlet implements HessianService {
    public void delete(long id) {

    }
}
