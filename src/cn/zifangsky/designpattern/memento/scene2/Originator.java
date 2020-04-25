package cn.zifangsky.designpattern.memento.scene2;

/**
 * 融合备忘录的发起人角色
 * <p>Clone方式的备忘录模式适用于较简单的场景。</p>
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Originator implements Cloneable{
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
     * @date 2018/5/4 15:34
     * @since 1.0.0
     * @return cn.zifangsky.designpattern.memento.scene2.Originator
     */
    public Originator createMemento(){
        return this.clone();
    }

    /**
     * 恢复一个备份
     * @author zifangsky
     * @date 2018/5/4 15:34
     * @since 1.0.0
     * @param originator 一个备份
     */
    public void restoreMemento(Originator originator){
        this.state = originator.getState();
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
