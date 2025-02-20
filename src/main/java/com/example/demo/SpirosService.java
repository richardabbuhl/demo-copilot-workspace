package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SpirosService {

    private static final Logger logger = LoggerFactory.getLogger(SpirosService.class);

    public void logHelloCall() {
        logger.info("Hello endpoint was called");
    }
}
