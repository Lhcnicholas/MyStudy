package com.example.demo;

import com.qjdchina.process.service.ProcessService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhc
 */
@SpringBootApplication
@EnableDubbo
@RestController
public class DemoApplication {

	@Reference
	private ProcessService processService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping
	public String index() {
		processService.isProcessEnd("12345");
		return "OK";
	}

}
