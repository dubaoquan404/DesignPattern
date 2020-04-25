package cn.zifangsky.designpattern.bridge.demo;

/**
 * 房子
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class House implements IProduct{

    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
