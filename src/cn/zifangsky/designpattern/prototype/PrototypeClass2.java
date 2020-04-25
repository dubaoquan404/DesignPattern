package cn.zifangsky.designpattern.prototype;

import java.util.ArrayList;

/**
 * 示例代码2
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public class PrototypeClass2 implements Cloneable{
    /**
     * 定义一个私有变量
     */
    private ArrayList<String> list = new ArrayList<String>();

    public PrototypeClass2() {
        System.out.println("PrototypeClass2：无参构造方法被执行");
    }

    public PrototypeClass2(ArrayList<String> list) {
        this.list = list;
        System.out.println("PrototypeClass2：有参构造方法被执行");
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
     * 深拷贝示例
     */
    @Override
    protected PrototypeClass2 clone() {
        PrototypeClass2 result = null;
        try {
            result = (PrototypeClass2) super.clone();
            result.list = (ArrayList<String>)this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return result;
    }
}
