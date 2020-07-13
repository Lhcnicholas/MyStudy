package com.niczo.Simple;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class MailTest {

	public static void main(String[] args) throws MessagingException {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("smtp.mxhichina.com");
		sender.setPort(25);
		sender.setUsername("lihongcheng@qjdchina.com");
		sender.setPassword("lhc!2345");

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setFrom("lihongcheng@qjdchina.com");
		helper.setTo("yangjingjing@qjdchina.com");
		helper.setText("heiheihei");

		sender.send(message);
	}
}
