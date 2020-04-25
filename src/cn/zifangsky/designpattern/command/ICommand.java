package cn.zifangsky.designpattern.command;

/**
 * 抽象的Command类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public interface ICommand {

    /**
     * 每个命令类都必须有一个执行命令的方法
     */
    public void execute();
}
