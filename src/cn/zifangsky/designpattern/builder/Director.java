package cn.zifangsky.designpattern.builder;

/**
 * 导演类
 *
 * @author zifangsky
 * @date 2018/6/4
 * @since 1.0.0
 */
public class Director {
    private AbstractBuilder builder = new ConcreteBuilder();

    public Product getAProduct(){
        //设置不同的零件，产生不同的产品
        builder.setPart();
        return builder.buildProduct();
    }
}