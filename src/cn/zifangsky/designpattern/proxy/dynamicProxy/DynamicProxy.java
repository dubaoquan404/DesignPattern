package cn.zifangsky.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(T t){
        //获得ClassLoader
        ClassLoader loader = t.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] interfaces = t.getClass().getInterfaces();
        //获得Handler
        InvocationHandler handler = new MyInvocationHandler(t);

        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }

        //执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
