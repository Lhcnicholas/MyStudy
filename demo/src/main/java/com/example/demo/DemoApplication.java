package com.example.demo;

import com.qjdchina.process.service.ProcessService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhc
 */
@SpringBootApplication
@EnableDubbo
@RestController
@ConfigurationProperties(prefix = "xxl.job")
@EnableConfigurationProperties
@Slf4j
public class DemoApplication {

	@Reference
	private ProcessService processService;

	@Value("${a}")
	private String a;

//	@Value("${b}")
//	private String b;

	private AdminConfig admin = new AdminConfig();

	public class AdminConfig {
		private String address;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String index() {
		log.info(a);
		return admin.address;
	}

	public AdminConfig getAdmin() {
		return admin;
	}
}
