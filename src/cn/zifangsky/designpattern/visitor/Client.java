package cn.zifangsky.designpattern.visitor;

import java.util.Random;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/14
 * @since 1.0.0
 */
public class Client {

    /**
     * 对象生成器，这里通过一个工厂方法模式模拟
     */
    private static Element createElement(){
        Random rand = new Random();
        if(rand.nextInt(100) > 50){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //获得元素对象
            Element el = createElement();
            //接受访问者访问
            el.accept(new Visitor());
        }
    }
}
