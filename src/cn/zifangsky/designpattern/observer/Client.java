package cn.zifangsky.designpattern.observer;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个被观察者
        AbstractSubject subject = new ConcreteSubject();
        //创建一个观察者
        Observer observer = new ConcreteObserver();
        //观察者观察被观察者
        subject.addObserver(observer);
        //观察者开始活动了
        subject.doSomething();
    }
}
