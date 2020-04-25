package cn.zifangsky.designpattern.decorator;

/**
 * 抽象装饰者
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public abstract class AbstractDecorator implements IComponent {
    /**
     * 被装饰者
     */
    private IComponent component;

    /**
     * 通过构造方法传递被装饰者
     */
    public AbstractDecorator(IComponent component) {
        this.component = component;
    }

    /**
     * 委托给被装饰者执行
     */
    @Override
    public void baseMethod() {
        this.component.baseMethod();
    }

    /**
     * 额外的装饰方法
     */
    public abstract void decorateMethod();
}
