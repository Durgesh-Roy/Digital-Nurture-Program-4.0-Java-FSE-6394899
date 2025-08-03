package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogService {
    private static final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void process(String input) {
        logger.info("Processing input: {}", input);

        if (input == null || input.isEmpty()) {
            logger.warn("Input is empty or null");
        }

        if ("error".equalsIgnoreCase(input)) {
            logger.error("An error input was encountered!");
        }
    }
}
