package cn.zifangsky.designpattern.factory;

/**
 * 抽象产品类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractProduct {

    /**
     * 产品类的公共方法
     */
    public void commonMethod(){
        System.out.println("模拟产品类的公共业务逻辑");
    }

    /**
     * 每种具体产品的独有方法
     */
    public abstract void specificMethod();
    
}
