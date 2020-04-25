package cn.zifangsky.designpattern.observer.java;

import java.util.Observable;

/**
 * 优化后的被观察者
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public class HanFeiZi extends Observable implements IHanFeiZi{

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");

        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");

        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
