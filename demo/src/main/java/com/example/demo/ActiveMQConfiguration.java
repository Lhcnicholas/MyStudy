package com.example.demo;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

/**
 * @author lhc
 */
@Configuration
public class ActiveMQConfiguration {

	@Autowired
	private ConnectionFactory connectionFactory;

	@Bean
	public DefaultJmsListenerContainerFactory topicContainerFactory(DefaultJmsListenerContainerFactoryConfigurer configurer, ConnectionFactory connectionFactory) {
		DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
		configurer.configure(jmsListenerContainerFactory, connectionFactory);
		jmsListenerContainerFactory.setPubSubDomain(true);
		return jmsListenerContainerFactory;
	}

	@Bean
	public JmsTemplate topicTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory);
		Destination destination = new ActiveMQTopic("ACT_EVENT_MemberFee");
		jmsTemplate.setDefaultDestination(destination);
		return jmsTemplate;
	}
}
