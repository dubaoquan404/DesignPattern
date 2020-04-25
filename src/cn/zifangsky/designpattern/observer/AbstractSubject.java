package cn.zifangsky.designpattern.observer;

import java.util.Vector;

/**
 * 抽象的被观察者
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public abstract class AbstractSubject {
    /**
     * 定义一个观察者数组
     */
    private Vector<Observer> vector = new Vector<Observer>();

    /**
     * 增加一个观察者
     */
    public void addObserver(Observer observer){
        this.vector.add(observer);
    }

    /**
     * 删除一个观察者
     */
    public void deleteObserver(Observer observer){
        this.vector.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        vector.forEach(Observer :: update);
    }

    /**
     * 被观察者从事的活动
     */
    public abstract void doSomething();
}
