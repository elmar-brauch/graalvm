package de.bsi.graalvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${application.name}")
	private String applicationName;
	
	private final Logger log = LoggerFactory.getLogger(DemoController.class);

	@GetMapping(path = "/demo", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String demo() {
		log.info("Incoming GET request...");
		return "{\"content\":\"Hello from %s\"}".formatted(applicationName);
	}
	
}
