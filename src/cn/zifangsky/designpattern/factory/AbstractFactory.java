package cn.zifangsky.designpattern.factory;

/**
 * 抽象工厂类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractFactory {
    /**
     * 创造不同的产品
     */
    public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
