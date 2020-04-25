package cn.zifangsky.designpattern.bridge.demo;

/**
 * 抽象产品类
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public interface IProduct {

    /**
     * 产品被生产出来
     */
    public void beProducted();

    /**
     * 产品被售卖出去
     */
    public void beSelled();
}
