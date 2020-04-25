package cn.zifangsky.designpattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 优化后的观察者
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public class LiSi implements Observer {

    /**
     * 首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
     */
    @Override
    public void update(Observable observable, Object object) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportBoss(object.toString());
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportBoss(String text){
        System.out.println("李斯：报告，韩非子有活动了--->" + text);
    }
}
