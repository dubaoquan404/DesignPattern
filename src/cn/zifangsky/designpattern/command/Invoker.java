package cn.zifangsky.designpattern.command;

/**
 * 调用者Invoker类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public class Invoker {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action(){
        this.command.execute();
    }
}
