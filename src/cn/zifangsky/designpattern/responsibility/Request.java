package cn.zifangsky.designpattern.responsibility;

/**
 * 请求详情
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Request {
    /**
     * 请求级别
     */
    private int requestLevel;
    /**
     * 请求内容
     */
    private String requestMessage;

    public Request(int requestLevel, String requestMessage) {
        this.requestLevel = requestLevel;
        this.requestMessage = requestMessage;
    }

    public int getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(int requestLevel) {
        this.requestLevel = requestLevel;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }
}
