package com.log4shell.log4shellpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MainController {

	private static final Logger logger = LogManager.getLogger("Log4Shell");
	
    @GetMapping("/")
    public String index(@RequestHeader("user-agent") String userAgent) {
        logger.error("Logging user-agent: {}", userAgent);
        return "OK";
    }
}
