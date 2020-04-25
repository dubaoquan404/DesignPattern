package cn.zifangsky.designpattern.mediator;

/**
 * 具体同事类2
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class ConcreteColleague2 extends Colleague {

    /**
     * 通过构造函数传递中介者
     */
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法 self-method
     */
    public void selfMethod(){
        //处理自己的业务逻辑
        System.out.println("ConcreteColleague2 自己的业务逻辑");
    }

    /**
     * 依赖方法 dep-method
     */
    public void depMethod(){
        //处理自己的业务逻辑

        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();

    }

}
