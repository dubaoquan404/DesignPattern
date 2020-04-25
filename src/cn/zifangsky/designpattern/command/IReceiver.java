package cn.zifangsky.designpattern.command;

/**
 * 通用Receiver类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public interface IReceiver {

    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     */
    public void doSomething();
}
