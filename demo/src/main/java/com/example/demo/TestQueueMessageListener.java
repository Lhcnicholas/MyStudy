package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.stereotype.Component;

import javax.jms.JMSConnectionFactory;

/**
 * @author lhc
 */
@Component
@Slf4j
public class TestQueueMessageListener{

	@JmsListener(destination = "out.queue")
	public void receive(String message){
		log.info(message);
	}

	@JmsListener(destination = "vir.A.ACT_EVENT_MemberFee")
	public void receive1(String message) {
		log.info("virtualTopic:{}", message);
	}

	@JmsListener(destination = "ACT_EVENT_MemberFee", containerFactory = "topicContainerFactory")
	public void consumeTopic(Message message) {
		log.info("topic:{}", message);
	}
}
