package com.niczo.simple;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lhc
 */
public class ThreadPoolTest {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1,
				TimeUnit.SECONDS, new ArrayBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());

		Runtime.getRuntime().availableProcessors();
		for (int i = 0; i < 1000; i++) {
			//创建WorkerThread对象（WorkerThread类实现了Runnable 接口）
			Runnable worker = () -> {
				System.out.println(Thread.currentThread().toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
			//执行Runnable
			threadPoolExecutor.setCorePoolSize(10);
			threadPoolExecutor.execute(worker);
		}
		//终止线程池
		threadPoolExecutor.shutdown();
		while (!threadPoolExecutor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
