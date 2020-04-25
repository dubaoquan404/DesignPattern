package cn.zifangsky.designpattern.memento.scene3;

/**
 * 发起人自主备份和恢复
 * <p>使用Clone方式的备忘录模式，可以使用在比较简单的场景或者比较单一的场景中，尽量不要与其他的对象产生严重的耦合关系。</p>
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

    /**
     * 备份对象
     */
    private Originator backup;

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
     */
    public void createMemento(){
        this.backup =  this.clone();
    }

    /**
     * 恢复一个备份
     * @author zifangsky
     * @date 2018/5/4 15:34
     * @since 1.0.0
     */
    public void restoreMemento(){
        if(backup != null){
            this.state = this.backup.getState();
        }
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
