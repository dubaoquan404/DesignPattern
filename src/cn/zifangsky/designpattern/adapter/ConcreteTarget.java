package cn.zifangsky.designpattern.adapter;

/**
 * 目标角色的实现类
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class ConcreteTarget implements ITarget{

    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
