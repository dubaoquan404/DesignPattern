package cn.zifangsky.designpattern.memento.scene4;

/**
 * 备忘录管理员角色
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Caretaker {
    /**
     * 备忘录对象
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
