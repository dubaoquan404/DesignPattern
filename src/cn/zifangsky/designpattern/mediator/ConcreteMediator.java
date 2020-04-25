package cn.zifangsky.designpattern.mediator;

/**
 * 通用中介者
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class ConcreteMediator extends Mediator {

    /**
     * 调用同事类的方法
     */
    @Override
    public void doSomething1() {
        super.c2.selfMethod();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod();
    }
}
