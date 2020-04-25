package cn.zifangsky.designpattern.strategy;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //申明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();

        //执行封装后的方法
        Context context = new Context(strategy);
        context.doSomething();
    }
}
