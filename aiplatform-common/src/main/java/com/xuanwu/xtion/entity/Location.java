package com.xuanwu.xtion.entity;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class Location {

    /**
     * x坐标最小
     */
    private String xmin;
    /**
     * y坐标最小
     */
    private String ymin;
    /**
     * x坐标最大
     */
    private String xmax;
    /**
     * y坐标最大
     */
    private String ymax;

    public String getXmin() {
        return xmin;
    }

    public void setXmin(String xmin) {
        this.xmin = xmin;
    }

    public String getYmin() {
        return ymin;
    }

    public void setYmin(String ymin) {
        this.ymin = ymin;
    }

    public String getXmax() {
        return xmax;
    }

    public void setXmax(String xmax) {
        this.xmax = xmax;
    }

    public String getYmax() {
        return ymax;
    }

    public void setYmax(String ymax) {
        this.ymax = ymax;
    }
}
