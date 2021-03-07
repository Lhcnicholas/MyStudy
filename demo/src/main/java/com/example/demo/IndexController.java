package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lhc
 */
@RequestMapping
@Controller
public class IndexController {

	@RequestMapping("getEnum")
	@ResponseBody
	public List<Map<String,String>> getEnum() {
		return Arrays.stream(SexEnum.values())
				.map(sexEnum -> {
					Map<String, String> map = new HashMap<>();
					map.put("key", sexEnum.getKey());
					map.put("value", sexEnum.getValue());
					return map;
				})
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SexEnum sexEnum = SexEnum.MALE;
		System.out.println(sexEnum.ordinal());
		System.out.println(SexEnum.FEMALE.ordinal());
	}
}
