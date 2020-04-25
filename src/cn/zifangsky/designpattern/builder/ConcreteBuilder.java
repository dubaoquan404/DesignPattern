package cn.zifangsky.designpattern.builder;

/**
 * 具体建造者
 *
 * @author zifangsky
 * @date 2018/6/4
 * @since 1.0.0
 */
public class ConcreteBuilder extends AbstractBuilder{
    private Product product = new Product();

    @Override
    public void setPart() {
        //设置产品零件
    }

    @Override
    public Product buildProduct() {
        //组建一个产品
        return product;
    }
}
