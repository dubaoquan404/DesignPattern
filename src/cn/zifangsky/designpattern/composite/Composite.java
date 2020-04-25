package cn.zifangsky.designpattern.composite;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Composite extends Component{

    private ArrayList<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.list.add(component);
    }

    @Override
    public void remove(Component component) {
        this.list.remove(component);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return this.list;
    }

    @Override
    public void doSomething() {
        System.out.println("模拟树枝构件的业务逻辑");
    }
}
