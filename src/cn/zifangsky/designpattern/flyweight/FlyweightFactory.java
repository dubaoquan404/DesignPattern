package cn.zifangsky.designpattern.flyweight;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class FlyweightFactory {
    /**
     * 定义一个池容器
     */
    private static Map<String,Flyweight> pool = Collections.synchronizedMap(new HashMap<String, Flyweight>());

    /**
     * 享元工厂
     */
    public synchronized static Flyweight getFlyweight(String extrinsic){
        Flyweight result = null;

        if(pool.containsKey(extrinsic)){
            result = pool.get(extrinsic);
        }else{
            result = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic,result);
        }

        return result;
    }

}
