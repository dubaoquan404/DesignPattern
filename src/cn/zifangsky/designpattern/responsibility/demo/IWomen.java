package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 女性接口
 *
 * @author zifangsky
 * @date 2018/6/12 0012
 * @since 1.0.0
 */
public interface IWomen {
    /**
     * 取得当前的个人状况getType，通过返回值决定是结婚了还是没结婚、丈夫是否在世等
     */
    public int getType();

    /**
     * 请示的内容，要出去逛街还是吃饭等
     */
    public String getRequest();
}
