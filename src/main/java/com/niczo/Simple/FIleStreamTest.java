package com.niczo.Simple;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FIleStreamTest {

	public static void main(String[] args) throws IOException {
		String content = "What the fuck!";
		File file = new File("abc.pdf");
//		try {
//			FileOutputStream out = new FileOutputStream(file, true);
//			out.write(content.getBytes());
//			out.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		FileInputStream inputStream = new FileInputStream(file);
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		byte[] flag = new byte[8 * 1024];
		int i;
		while (( i = inputStream.read(flag)) > 0) {
			temp.write(flag, 0, i);
		}
		byte[] result = temp.toByteArray();

		FileOutputStream out = new FileOutputStream("bcd.pdf");
		out.write(result);

		inputStream.close();
		temp.close();
		out.close();
	}
}
