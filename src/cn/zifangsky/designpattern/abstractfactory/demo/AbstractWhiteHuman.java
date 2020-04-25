package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 白色人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人的皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话。。。");
    }
}
