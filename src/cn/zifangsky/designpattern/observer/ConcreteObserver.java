package cn.zifangsky.designpattern.observer;

/**
 * 具体的观察者
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public class ConcreteObserver implements Observer{

    @Override
    public void update() {
        System.out.println("接收到消息，并进行处理");
    }
}
