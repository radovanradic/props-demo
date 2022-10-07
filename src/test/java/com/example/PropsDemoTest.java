package com.example;

import com.example.config.MyConfiguration;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class PropsDemoTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    MyConfiguration configuration;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
        Assertions.assertNotNull(configuration);
    }

}
