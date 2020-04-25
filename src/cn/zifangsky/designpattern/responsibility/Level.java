package cn.zifangsky.designpattern.responsibility;

/**
 * 处理级别
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public enum Level {
    LEVEL1("处理级别1",1),LEVEL2("处理级别2",2),LEVEL3("处理级别3",3);

    private String name;
    private int level;

    Level(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
