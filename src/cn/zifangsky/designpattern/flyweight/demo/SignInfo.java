package cn.zifangsky.designpattern.flyweight.demo;

/**
 * 报考信息
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class SignInfo {
    /**
     * 报名人员ID
     */
    private String id;
    /**
     * 考试地点
     */
    private String location;
    /**
     * 考试科目
     */
    private String subject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
