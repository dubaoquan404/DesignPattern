package cn.zifangsky.designpattern.composite;

import java.util.ArrayList;

/**
 * 抽象组件
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public abstract class Component {
    /**
     * 个体和整体都具有的逻辑
     */
    public void doSomething(){
        System.out.println("模拟公有业务逻辑");
    }

    /**
     * 增加一个叶子构件或树枝构件
     */
    public abstract void add(Component component);

    /**
     * 删除一个叶子构件或树枝构件
     */
    public abstract void remove(Component component);

    /**
     * 获得分支下的所有叶子构件和树枝构件
     */
    public abstract ArrayList<Component> getChildren();
}
