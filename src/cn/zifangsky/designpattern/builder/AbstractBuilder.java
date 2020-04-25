package cn.zifangsky.designpattern.builder;

/**
 * 抽象建造者
 *
 * @author zifangsky
 * @date 2018/6/4
 * @since 1.0.0
 */
public abstract class AbstractBuilder {
    /**
     * 设置产品的不同零件，以获得不同的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     */
    public abstract Product buildProduct();
}