package cn.zifangsky.designpattern.abstractfactory;

/**
 * 抽象产品类A
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractProductA {

    /**
     * 产品类A的公共方法
     */
    public void commonMethod(){
        System.out.println("模拟产品类A的公共业务逻辑");
    }

    /**
     * 每种具体产品的独有方法
     */
    public abstract void specificMethod();
    
}
