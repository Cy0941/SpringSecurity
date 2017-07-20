package cn.cxy.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/19 23:32 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Spitter {

    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;


}
