package cn.zifangsky.designpattern.flyweight;

/**
 * 测试
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //初始化对象池
        for(int i=0;i<10;i++){
            String extrinsic = "外部状态" + i;

            FlyweightFactory.getFlyweight(extrinsic);
        }

        Flyweight flyweight = FlyweightFactory.getFlyweight("外部状态2");
        System.out.println(flyweight);
    }
}
