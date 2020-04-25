package cn.zifangsky.designpattern.factory;

/**
 * 具体工厂类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class ConcreteFactory extends AbstractFactory{

    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> c) {
        T product = null;

        try {
           product = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("创造产品的过程中出现异常");
        }

        return product;
    }
}
