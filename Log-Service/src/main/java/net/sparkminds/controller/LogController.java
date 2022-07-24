package net.sparkminds.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import net.sparkminds.service.LogService;
import net.sparkminds.service.dto.LogResponseDTO;

@RestController
@RequestMapping("api/logs")
@RequiredArgsConstructor
public class LogController {
	private final LogService logService;

	@GetMapping
	public ResponseEntity<List<LogResponseDTO>> getLogs() {
		return ResponseEntity.ok(logService.getAllLog());
	}
}
