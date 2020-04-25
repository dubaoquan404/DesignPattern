package cn.zifangsky.designpattern.visitor;

/**
 * 具体元素
 *
 * @author zifangsky
 * @date 2018/6/14
 * @since 1.0.0
 */
public class ConcreteElement2 extends Element {

    @Override
    public void doSomething() {
        System.out.println("ConcreteElement2模拟处理业务");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
