package cn.zifangsky.designpattern.memento.scene1;

/**
 * 备忘录角色
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Memento {
    /**
     * 发起人的内部状态
     */
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
