package it.simonegallizia.kafkaconsumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;



@Component
public class ConsumerComponent {
	private static final Logger logger = LogManager.getLogger(ConsumerComponent.class);
	
	@KafkaListener(topics = "b2b-events") 
	public void processEvent(String content) {
		logger.info("Event: " + content);

	} 
}
