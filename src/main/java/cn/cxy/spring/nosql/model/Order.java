package cn.cxy.spring.nosql.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/22 14:48 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Getter
@Setter
@Document
public class Order {

    @Id
    private String id;
    @Field("client ")
    private String customer;

    private String type;

    /**
     * items 为 order 文档内嵌的一部分  --  没有必要为 Item 添加任何注解
     */
    private Collection<Item> items = new LinkedHashSet<Item>();

}
