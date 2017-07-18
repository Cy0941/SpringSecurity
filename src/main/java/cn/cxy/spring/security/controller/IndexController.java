package cn.cxy.spring.security.controller;

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

    @RequestMapping(value = "login")
    public void login(Model model){
        System.out.println("login");
        //return "success";
    }

    @RequestMapping(value = "logout")
    public String logout(Model model){
        System.out.println("logout");
        return "success";
    }

}
