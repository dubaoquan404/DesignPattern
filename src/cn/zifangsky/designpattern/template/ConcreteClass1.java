package cn.zifangsky.designpattern.template;

/**
 * 具体实现类1
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public class ConcreteClass1 extends AbstractTemplate{

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 doAnything");
    }
}
