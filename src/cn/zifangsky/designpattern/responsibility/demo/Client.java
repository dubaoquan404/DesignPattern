package cn.zifangsky.designpattern.responsibility.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //随机选择几个女性
        Random random = new Random();

        List<IWomen> list = new ArrayList<>(8);
        for(int i=0;i<5;i++){
            list.add(new Women(random.nextInt(3) + 1,"我要出去逛街"));
        }

        //定义三个请示对象
        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();

        //设置请示顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        //每个女性分别开始请示
        list.forEach(father :: handlerMessage);
//        list.forEach(women -> father.handlerMessage(women));
    }
}
