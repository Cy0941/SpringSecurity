package cn.cxy.spring.security.controller;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/17 16:32 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Controller(value = "/index/")
public class IndexController {

    @PreAuthorize("hasPermission(null ,null ,null )")
    @PostFilter("hasPermission(null,null,null)")
    @RequestMapping(value = "login")
    public void login(){
        System.out.println("login");
    }

    @RequestMapping(value = "logout")
    public String logout(Model model){
        System.out.println("logout");
        return "success";
    }

}
