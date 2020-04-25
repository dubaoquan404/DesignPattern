package cn.zifangsky.designpattern.flyweight.demo;

/**
 * 带对象池的报考信息
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class SignInfo4Pool extends SignInfo{
    /**
     * 定义一个对象池提取的KEY值
     */
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;

        String[] values = key.split("#");

        if(values.length == 2){
            super.setSubject(values[0]);
            super.setLocation(values[1]);
        }
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
