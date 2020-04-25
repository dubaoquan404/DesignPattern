package cn.zifangsky.designpattern.command;

/**
 * 具体的Receiver类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class ConcreteReciver implements IReceiver {

    @Override
    public void doSomething() {
        System.out.println("模拟具体的业务逻辑");
    }
}
