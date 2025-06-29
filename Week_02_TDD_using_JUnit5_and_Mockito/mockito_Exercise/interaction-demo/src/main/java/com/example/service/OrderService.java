package com.example.service;

import com.example.logging.LoggingService;

public class OrderService {
    private final LoggingService logger;

    public OrderService(LoggingService logger) {
        this.logger = logger;
    }

    public void placeOrder(String itemId) {
        // Imagine business logic here
        logger.log("Order placed for item: " + itemId);
    }
}
