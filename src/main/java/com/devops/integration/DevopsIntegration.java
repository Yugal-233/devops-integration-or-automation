package com.devops.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsIntegration {

	@GetMapping("/devops")
	public String devopsIntegration() {
		return "Devops integration is done successfull";
	}
}
