package cn.zifangsky.designpattern.visitor;

/**
 * 抽象访问者
 *
 * @author zifangsky
 * @date 2018/6/14
 * @since 1.0.0
 */
public interface IVisitor {
    /**
     * 可以访问哪些对象
     */
    public void visit(ConcreteElement1 element1);

    /**
     * 可以访问哪些对象
     */
    public void visit(ConcreteElement2 element2);

}
