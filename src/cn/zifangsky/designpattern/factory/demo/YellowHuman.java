package cn.zifangsky.designpattern.factory.demo;

/**
 * 黄色人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话。。。");
    }
}
