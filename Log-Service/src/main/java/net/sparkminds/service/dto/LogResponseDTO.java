package net.sparkminds.service.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LogResponseDTO {
	private String email;
	private String ipAddress;
	private String message;
}
