package com.xuanwu.xtion.task;


import com.xuanwu.xtion.grpc.media.MediaGrpcClient;
import com.xuanwu.xtion.grpc.media.impl.MediaGrpcClientImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit4Test {

    @Autowired
    private MediaGrpcClient mediaGrpcClient;

    @Test
    public void testCheckImageFuzzy() throws InterruptedException {
        final MediaGrpcClient temp = mediaGrpcClient;
        mediaGrpcClient.checkImageFuzzy("");
//        final CountDownLatch latch = new CountDownLatch(2);
//        Executor executor = Executors.newFixedThreadPool(2);
//        executor.execute(() -> {
//            int x = 30;
//            while (x > 0) {
//                boolean res = temp.checkImageFuzzy("ddd");
//                System.out.println("checkImageFuzzy return is " + res);
//                --x;
//            }
//            latch.countDown();
//        });
//        executor.execute(() -> {
//            int x = 30;
//            while (x > 0) {
//                String res = temp.fetchImage("ddd", "ddd");
//                System.out.println("fetchImage return is " + res);
//                --x;
//            }
//            latch.countDown();
//        });
//        latch.await();
    }

}
