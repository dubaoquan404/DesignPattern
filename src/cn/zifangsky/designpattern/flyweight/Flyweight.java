package cn.zifangsky.designpattern.flyweight;

/**
 * 抽象享元角色
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public abstract class Flyweight {
    /**
     * 内部状态
     */
    private String intrinsic;

    /**
     * 外部状态
     */
    protected final String extrinsic;

    protected Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 定义业务操作
     */
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "intrinsic='" + intrinsic + '\'' +
                ", extrinsic='" + extrinsic + '\'' +
                '}';
    }
}
