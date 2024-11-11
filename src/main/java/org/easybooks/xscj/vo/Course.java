package org.easybooks.xscj.vo;

import java.io.Serializable;

public class Course implements Serializable {
    private String kcm; // 课程名
    private int xs;     // 学时
    private int xf;     // 学分

    // 默认构造方法
    public Course() {}

    // getter 和 setter 方法
    public String getKcm() {
        return kcm;
    }

    public void setKcm(String kcm) {
        this.kcm = kcm;
    }

    public int getXs() {
        return xs;
    }

    public void setXs(int xs) {
        this.xs = xs;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }
}
