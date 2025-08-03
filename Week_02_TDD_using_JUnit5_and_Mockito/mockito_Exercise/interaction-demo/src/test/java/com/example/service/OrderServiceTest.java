package com.example.service;

import com.example.logging.LoggingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Test
    void testPlaceOrder_logsCorrectMessage() {
        // Arrange
        LoggingService logger = mock(LoggingService.class);
        OrderService orderService = new OrderService(logger);

        // Act
        orderService.placeOrder("ABC123");

        // Assert - Verifying interaction
        verify(logger).log("Order placed for item: ABC123");
        verifyNoMoreInteractions(logger);
    }
}
