package cn.zifangsky.designpattern.memento.scene2;

/**
 * 备忘录管理员角色
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Caretaker {
    /**
     * 发起人对象
     */
    private Originator originator;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
