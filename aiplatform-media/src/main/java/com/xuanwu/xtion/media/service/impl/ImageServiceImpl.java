package com.xuanwu.xtion.media.service.impl;

import com.xuanwu.xtion.media.service.ImageService;
import org.springframework.stereotype.Service;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public boolean checkImageFuzzy(String imageUrl) {
        return false;
    }

    @Override
    public String fetchImage(String imageUrl, String imageName) {
        return new StringBuilder().append(imageName).toString();
    }

}
