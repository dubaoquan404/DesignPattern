package cn.zifangsky.designpattern.visitor;

/**
 * 抽象元素
 *
 * @author zifangsky
 * @date 2018/6/14
 * @since 1.0.0
 */
public abstract class Element {

    /**
     * 定义业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许谁访问
     */
    public abstract void accept(IVisitor visitor);
}
