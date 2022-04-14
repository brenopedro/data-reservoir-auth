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
@ConfigurationProperties("datareservoir.client")
public class ClientProperties {

	@NotNull
	private String webServiceUsername;
	
	@NotNull
	private String webServicePassword;
	
	@NotNull
	private String adminUsername;
	
	@NotNull
	private String adminPassword;
}
