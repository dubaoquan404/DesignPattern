package cn.zifangsky.designpattern.adapter;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        ITarget target = new ConcreteTarget();
        target.request();

        //现在增加了适配器角色后的业务逻辑
        Adaptee adaptee = new Adaptee();
        ITarget target2 = new Adapter(adaptee);
        target2.request();
    }
}
