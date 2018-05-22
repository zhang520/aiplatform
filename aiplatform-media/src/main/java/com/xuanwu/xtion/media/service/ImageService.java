package com.xuanwu.xtion.media.service;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
public interface ImageService {

    public boolean checkImageFuzzy(String imageUrl);

    public String fetchImage(String imageUrl, String imageName);

}
