package cn.zifangsky.designpattern.responsibility;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义三个处理节点
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        AbstractHandler handler3 = new ConcreteHandler3();

        //设置链中的处理顺序：1-->2->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        //提交请求
        handler1.handlerMessage(new Request(3,"我要出去逛街"));
    }
}
