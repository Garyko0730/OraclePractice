package org.easybooks.xscj.vo;
import java.io.Serializable;

public class Score implements Serializable {
    private String xm;   // 姓名
    private String kcm;  // 课程名
    private int cj;      // 成绩

    // 默认构造方法
    public Score() {}

    // getter 和 setter 方法
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getKcm() {
        return kcm;
    }

    public void setKcm(String kcm) {
        this.kcm = kcm;
    }

    public int getCj() {
        return cj;
    }

    public void setCj(int cj) {
        this.cj = cj;
    }
}
