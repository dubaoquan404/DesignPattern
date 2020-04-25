package cn.zifangsky.designpattern.decorator;

/**
 * 具体的装饰者2
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class ConcreteDecorator2 extends AbstractDecorator{

    /**
     * 通过构造方法传递被装饰者
     * @param component 被装饰者
     */
    public ConcreteDecorator2(IComponent component) {
        super(component);
    }

    @Override
    public void decorateMethod() {
        System.out.println("执行ConcreteDecorator2的装饰方法");
    }

    @Override
    public void baseMethod() {
        //基本方法
        super.baseMethod();
        //额外的装饰方法
        this.decorateMethod();
    }
}
