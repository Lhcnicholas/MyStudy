package com.niczo.Simple;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderTest {

	public static void main(String[] args) {
		try {
			Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("com/niczo/Simple/");
			while (resources.hasMoreElements()) {
				URL url = resources.nextElement();
				File file = new File(url.getFile());
				if (file.isDirectory()) {
					File[] files = file.listFiles();
					for (File file1 : files) {
						System.out.println(file1.getName());
						if (file1.getName().endsWith(".class")) {
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		URL resource = ClassLoaderTest.class.getResource("");
		System.out.println(resource.toString());
	}
}
