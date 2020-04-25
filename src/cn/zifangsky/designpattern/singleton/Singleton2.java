package cn.zifangsky.designpattern.singleton;

/**
 * 单例模式——懒汉式
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Singleton2 {
    private static volatile Singleton2 SINGLETON;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        if(SINGLETON == null){
            synchronized (Singleton2.class){
                if(SINGLETON == null){
                    SINGLETON = new Singleton2();
                }
            }
        }

        return SINGLETON;
    }
}
