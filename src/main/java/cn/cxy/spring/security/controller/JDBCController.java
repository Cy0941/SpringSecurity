package cn.cxy.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/19 22:59 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Controller
public class JDBCController {

    private DataSource dataSource;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public void insert(){
        Connection connection = null;
        PreparedStatement ps = null;
        String sql = "insert into spitter(username,password,fullName) values(?,?,?)";
        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,"username");
            ps.setString(2,"password");
            ps.setString(3,"fullName");
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != ps) {
                    ps.close();
                }
                if (null != connection) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
