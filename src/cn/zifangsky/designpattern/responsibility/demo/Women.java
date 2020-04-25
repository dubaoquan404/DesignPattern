package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 女性类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Women implements IWomen{

    /**
     * 通过一个int类型的参数来描述个人状况：
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type;

    /**
     * 请示的内容
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;

        //为了便于显示，在这里做了点处理
        switch(this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
            default:
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
