package com.xuanwu.xtion.grpc.media;


import com.xuanwu.xtion.grpc.message.BasicMessageProto;
import com.xuanwu.xtion.grpc.message.image.ImageMediaProto;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public interface MediaGrpcClient {
    /**
     * 判断照片是否模糊
     * @param imageUrl 图片地址
     * @return
     */
    public boolean checkImageFuzzy(String imageUrl);

    /**
     * fetch图片到另一个七牛云服务器
     * @param imageUrl 图片地址
     * @Param imageName 图片名字
     * @return
     */
    public String fetchImage(String imageUrl, String imageName);
}
