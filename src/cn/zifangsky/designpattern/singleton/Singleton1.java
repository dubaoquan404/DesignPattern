package cn.zifangsky.designpattern.singleton;

/**
 * 单例模式——饿汉式
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return SINGLETON;
    }
}
