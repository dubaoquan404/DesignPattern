package cn.zifangsky.designpattern.proxy.dynamicProxy;

/**
 * 通知接口
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public interface IAdvice {
    /**
     * 通知只有一个方法，执行即可
     */
    public void exec();
}
