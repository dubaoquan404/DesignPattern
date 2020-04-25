package cn.zifangsky.designpattern.visitor;

/**
 * 具体访问者
 *
 * @author zifangsky
 * @date 2018/6/14
 * @since 1.0.0
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
