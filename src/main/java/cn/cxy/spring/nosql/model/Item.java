package cn.cxy.spring.nosql.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/7/22 14:50 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Setter
@Getter
public class Item {

    private Long id;
    private Order order;
    private String product;
    private double price;
    private int quantity;

}
