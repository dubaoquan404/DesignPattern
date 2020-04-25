package cn.zifangsky.designpattern.memento.scene4;

import java.util.Map;

/**
 * 备忘录角色
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Memento {
    /**
     * 多个状态
     */
    private Map<String,Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
