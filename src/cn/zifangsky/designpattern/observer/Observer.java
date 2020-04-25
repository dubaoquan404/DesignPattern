package cn.zifangsky.designpattern.observer;

/**
 * 观察者接口
 *
 * @author zifangsky
 * @date 2018/6/1
 * @since 1.0.0
 */
public interface Observer {
    /**
     * 更新方法，观察者发现情况后的处理逻辑
     */
    public void update();
}
