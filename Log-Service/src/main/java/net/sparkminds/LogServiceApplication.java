package net.sparkminds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import lombok.RequiredArgsConstructor;
import net.sparkminds.service.LogService;

@SpringBootApplication
@RequiredArgsConstructor
public class LogServiceApplication {
	private final LogService logService;
	public static void main(String[] args) {
		SpringApplication.run(LogServiceApplication.class, args);
	}

	@KafkaListener(topics = "${kafka.topic_name}", groupId = "${kafka.group_id}")
	public void listener(String message) {
		logService.getMessagekafka(message);
	}
}
