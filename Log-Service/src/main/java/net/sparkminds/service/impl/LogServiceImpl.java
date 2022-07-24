package net.sparkminds.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.sparkminds.entity.LoggerInfo;
import net.sparkminds.repository.LoggerRepository;
import net.sparkminds.service.LogService;
import net.sparkminds.service.dto.LogResponseDTO;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {
	private final LoggerRepository loggerRepository;

	@Override
	public List<LogResponseDTO> getAllLog() {
		return loggerRepository.findAll().stream().map(entity -> {
			return LogResponseDTO.builder().email(entity.getEmail()).ipAddress(entity.getIpAdress())
					.message(entity.getMessage()).build();
		}).collect(Collectors.toList());
	}

	@Override
	public void getMessagekafka(String message) {
		LoggerInfo log = new LoggerInfo();
		log.setEmail(message.split(", ")[0]);
		log.setIpAdress(message.split(", ")[1]);
		log.setMessage(message.split(", ")[2]);
		loggerRepository.save(log);
	}
}
