package cn.zifangsky.designpattern.proxy.dynamicProxy;

/**
 * 抽象主题类
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public interface ISubject {
    /**
     * 业务操作
     */
    public void doSomething(String str);
}
