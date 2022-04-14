package com.reservoir.datareservoir.auth.core.properties;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
@Component
@Setter
@Getter
@ConfigurationProperties("datareservoir.resource")
public class ResourceProperties {

	@NotNull
	private String baseUsername;
	
	@NotNull
	private String basePassword;
	
	@NotNull
	private String clientUsername;
	
	@NotNull
	private String clientPassword;
	
	@NotNull
	private String adminUsername;
	
	@NotNull
	private String adminPassword;
}
