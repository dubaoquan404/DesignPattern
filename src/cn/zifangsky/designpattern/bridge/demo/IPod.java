package cn.zifangsky.designpattern.bridge.demo;

/**
 * 房子
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class IPod implements IProduct{

    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
