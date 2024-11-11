package org.easybooks.xscj.vo;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String xm; // 姓名
    private String xb; // 性别
    private Date csrq; // 出生日期
    private int kcs; // 课程数
    private String bz; // 备注
    private byte[] zp; // 照片（字节数组）

    // 默认构造方法
    public Student() {}

    // getter 和 setter 方法
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    public int getKcs() {
        return kcs;
    }

    public void setKcs(int kcs) {
        this.kcs = kcs;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public byte[] getZp() {
        return zp;
    }

    public void setZp(byte[] zp) {
        this.zp = zp;
    }
}
