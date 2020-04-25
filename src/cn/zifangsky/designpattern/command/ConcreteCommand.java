package cn.zifangsky.designpattern.command;

/**
 * 具体的Command类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class ConcreteCommand implements ICommand{
    /**
     * 调用哪个IReceiver类完成命令处理
     */
    private IReceiver receiver;

    public ConcreteCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //实际业务处理
        receiver.doSomething();
    }
}
