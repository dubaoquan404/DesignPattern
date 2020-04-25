package cn.zifangsky.designpattern.adapter;

/**
 * 源角色
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Adaptee {

    /**
     * 原有的业务逻辑
     */
    public void specificRequest(){
        System.out.println("I'm kind of busy,leave me alone,pls!");
    }
}
