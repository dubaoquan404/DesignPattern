package cn.zifangsky.designpattern.proxy;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/5
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();

        //产生一个代理类
        ISubject proxy = new Proxy(subject);
        //通过代理类执行业务逻辑
        proxy.request();
    }
}
