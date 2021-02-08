package com.niczo.simple;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest implements Test {
	@Override
	public void test() {
		Map<String, String> hs = new HashMap<>();
		hs.put("1", "");
		hs.put("2", "lihongcheng");
		hs.put("3", "");
		hs.put("4", "nic");

		Iterator<Map.Entry<String,String>> iterator = hs.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getValue().equals("")) {
				iterator.remove();
			}
		}
		Assert.isTrue(hs.size() == 2);
		System.out.println(hs.size());
	}
}
