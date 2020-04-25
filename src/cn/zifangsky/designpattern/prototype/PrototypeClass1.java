package cn.zifangsky.designpattern.prototype;

import java.util.ArrayList;

/**
 * 示例代码1
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public class PrototypeClass1 implements Cloneable{
    /**
     * 定义一个私有变量
     */
    private ArrayList<String> list = new ArrayList<String>();

    public PrototypeClass1() {
        System.out.println("PrototypeClass1：无参构造方法被执行");
    }

    public PrototypeClass1(ArrayList<String> list) {
        this.list = list;
        System.out.println("PrototypeClass1：有参构造方法被执行");
    }

    /**
     * 设置ArrayList的值
     */
    public void addValue(String value){
        this.list.add(value);
    }

    /**
     * 获取ArrayList的值
     */
    public ArrayList<String> getValue(){
        return this.list;
    }

    /**
     * 浅拷贝示例
     */
    @Override
    protected PrototypeClass1 clone() {
        try {
            return (PrototypeClass1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
