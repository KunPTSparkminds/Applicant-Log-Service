package net.sparkminds.service;

import java.util.List;

import net.sparkminds.service.dto.LogResponseDTO;

public interface LogService {
	List<LogResponseDTO> getAllLog();
	
	void getMessagekafka(String message);
}
