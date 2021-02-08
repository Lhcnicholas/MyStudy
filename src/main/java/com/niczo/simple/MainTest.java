package com.niczo.simple;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Des:
 * Author:LiNic
 * Date:2018/5/27
 */
@SuppressWarnings("cast")
public class MainTest {
    public static void main(String[] args) throws InterruptedException {


        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(20);
        threadPoolTaskExecutor.initialize();

        long startTime = System.currentTimeMillis();

        CountDownLatch countDownLatch = new CountDownLatch(1000);
        for (int i = 0; i < 1000; i++) {
            threadPoolTaskExecutor.execute(() -> {
                Jedis jedis = new Jedis("127.0.0.1", 6379);
                jedis.auth("qjd123456");

                jedis.watch("stock");
                String stock1 = jedis.get("stock");
                if (stock1.equals("0")) {
                    System.out.println("秒杀结束");
                    return;
                }

                Transaction multi = jedis.multi();
                try {

                    multi.decr("stock");

                    List<Object> exec = multi.exec();

                    if (exec != null) {
                        System.out.println("秒杀成功");
                    } else {
                        System.out.println("秒杀失败");
                    }
                } catch (Exception e) {
                    multi.discard();
                } finally {
                  countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("用时：" + (System.currentTimeMillis() - startTime));
        threadPoolTaskExecutor.shutdown();


        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.initialize();

        CountDownLatch countDownLatch1 = new CountDownLatch(1000);
        long l = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            executor.execute(() -> {
                Jedis jedis = new Jedis("127.0.0.1", 6379);
                jedis.auth("qjd123456");

                Long stock = jedis.decr("stock");
                if (stock >= 0) {
                    System.out.println("秒杀成功");
                } else {
                    System.out.println("秒杀失败，活动结束");
                }
                countDownLatch1.countDown();
            });
        }
        countDownLatch1.await();
        System.out.println("用时：" + (System.currentTimeMillis() - l));

        executor.shutdown();
    }


    public static void testMethod(Test test){
        test.test();
    }
}

