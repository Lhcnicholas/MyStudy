package com.niczo.Simple;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * @author lhc
 */
public class FIleStreamTest implements Runnable{

	private Integer value;

	public static void main(String[] args) throws IOException {

		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(10);
		//taskExecutor.setQueueCapacity(100);
		taskExecutor.initialize();
		int i = 0;
		while (i++ < 100) {
			System.out.println("执行第"+i+"次");
			taskExecutor.submit(new FIleStreamTest(i));
		}
		taskExecutor.shutdown();

		taskExecutor.destroy();
	}

	public FIleStreamTest(Integer value) {
		this.value = value;
	}

	public void test() throws IOException{
		String content = "What the fuck!";
		File file = new File("abc.pdf");
		File zipFile = new File("a.zip");

		byte[] result = (value.toString()+" ").getBytes();
		System.out.println("写入成功,值为:" + value);
//		FileOutputStream out = new FileOutputStream("bcd.txt", true);
//		out.write(result);

		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile, true));
		ZipEntry zipEntry = new ZipEntry(value.toString()+".txt");
		zipOut.putNextEntry(zipEntry);
		zipOut.write(value.toString().getBytes());
		zipOut.closeEntry();
		zipOut.close();

//		inputStream.close();
//		temp.close();
//		out.close();
	}

	@Override
	public void run() {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
