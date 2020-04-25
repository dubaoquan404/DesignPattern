package cn.zifangsky.designpattern.observer.java;

import java.util.Observer;

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
        HanFeiZi hanFeiZi = new HanFeiZi();
        //创建一个观察者
        Observer liSi = new LiSi();

        //给韩非子添加观察者
        hanFeiZi.addObserver(liSi);
        //韩非子开始吃饭了
        hanFeiZi.haveBreakfast();
    }
}
