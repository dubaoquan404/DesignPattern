package cn.zifangsky.designpattern.observer;

/**
 * 具体被观察者
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public class ConcreteSubject extends AbstractSubject{

    @Override
    public void doSomething() {
        System.out.println("模拟被观察者从事的活动");

        super.notifyObservers();
    }
}
