package cn.zifangsky.designpattern.factory.demo;

/**
 * 黑色人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑人的皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话。。。");
    }
}
