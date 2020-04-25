package cn.zifangsky.designpattern.flyweight.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 报考信息工厂
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class SignInfoFactory {
    /**
     * 定义一个池容器
     */
    private static Map<String,SignInfo> pool = Collections.synchronizedMap(new HashMap<String, SignInfo>());

    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }

    /**
     * 定义工厂方法
     * @author zifangsky
     * @date 2018/5/16 14:02
     * @since 1.0.0
     * @param key 从对象池中提取对象的KEY值
     * @return cn.zifangsky.designpattern.flyweight.demo.SignInfo
     */
    public synchronized static SignInfo getSignInfo(String key){
        SignInfo result = null;

        if(pool.containsKey(key)){
            result = pool.get(key);
            System.out.println(key +"---直接从池中取得");
        }else{
            System.out.println(key + "----建立对象，并放到池中");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        }

        return result;
    }

}
