package com.example;

import org.junit.jupiter.api.Test;

public class LogServiceTest {

    @Test
    void testLoggingLevels() {
        LogService service = new LogService();
        service.process("hello");
        service.process("");
        service.process("error");
    }
}
