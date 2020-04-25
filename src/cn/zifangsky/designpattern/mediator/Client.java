package cn.zifangsky.designpattern.mediator;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setC1(colleague1);
        mediator.setC2(colleague2);

        //通过中介者完成的业务逻辑
        colleague1.depMethod();
    }
}
