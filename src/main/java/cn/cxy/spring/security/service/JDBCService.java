package cn.cxy.spring.security.service;

import cn.cxy.spring.security.model.Spitter;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/19 23:31 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Service
public class JDBCService {

    public static final String SELECT_SPITTER_BY_ID = "SQL";
    private DataSource dataSource;

    private JdbcOperations jdbcOperations;


    public Spitter findOne(long id){

        jdbcOperations.queryForObject(SELECT_SPITTER_BY_ID,new SpitterRowMapper(),id);

        return jdbcOperations.queryForObject(SELECT_SPITTER_BY_ID,new SpitterRowMapper(),id);

    }

    private Spitter mapSpitter(ResultSet rs,int row) throws SQLException{
        return new Spitter(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("fullName"),
                rs.getString("email")
        );
    }

    class SpitterRowMapper implements RowMapper<Spitter>{

        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Spitter(
              rs.getLong("id"),
              rs.getString("username"),
              rs.getString("password"),
              rs.getString("fullName"),
              rs.getString("email")
            );
        }
    }

}
