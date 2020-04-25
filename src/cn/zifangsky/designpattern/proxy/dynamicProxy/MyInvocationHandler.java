package cn.zifangsky.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class MyInvocationHandler implements InvocationHandler{
    /**
     * 被代理的对象
     */
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 代理方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
