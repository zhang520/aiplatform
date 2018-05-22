package com.xuanwu.xtion.entity;

import java.util.List;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public class ImageDetail {

    private String imageUrl;

    private String imageName;

    private byte[] imageBytes;

    private Location location;

    private List<Location> layerPoints;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Location> getLayerPoints() {
        return layerPoints;
    }

    public void setLayerPoints(List<Location> layerPoints) {
        this.layerPoints = layerPoints;
    }
}
