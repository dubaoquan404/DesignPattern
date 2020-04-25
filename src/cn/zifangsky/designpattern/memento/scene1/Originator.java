package cn.zifangsky.designpattern.memento.scene1;

/**
 * 发起人角色
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Originator {
    /**
     * 内部状态
     */
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备份
     * @author zifangsky
     * @date 2018/5/4 15:13
     * @since 1.0.0
     * @return cn.zifangsky.designpattern.memento.scene1.Memento
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 恢复一个备份
     * @author zifangsky
     * @date 2018/5/4 15:16
     * @since 1.0.0
     * @param memento 一个备忘录
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
