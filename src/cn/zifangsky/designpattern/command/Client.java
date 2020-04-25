package cn.zifangsky.designpattern.command;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //申明一个调用者Invoker
        Invoker invoker = new Invoker();

        //定义接收者
        IReceiver receiver = new ConcreteReciver();

        //定义一个要发送给接收者的命令
        ICommand command = new ConcreteCommand(receiver);

        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();


    }
}
