package cn.zifangsky.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/11
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        ISubject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        ISubject proxy = DynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
