package cn.zifangsky.designpattern.proxy.dynamicProxy;

/**
 * 真实主题类
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class RealSubject implements ISubject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
