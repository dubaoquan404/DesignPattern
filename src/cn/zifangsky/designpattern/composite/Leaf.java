package cn.zifangsky.designpattern.composite;

import java.util.ArrayList;

/**
 * 树叶构件
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Leaf extends Component{

    @Override
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void doSomething() {
        System.out.println("模拟树叶构件的业务逻辑");
    }
}
