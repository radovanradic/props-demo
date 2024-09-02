package com.example;

import com.example.config.MyConfiguration;
import com.example.config.Registration;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import java.util.List;

@MicronautTest
class PropsDemoTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    MyConfiguration configuration;

    @Inject
    List<Registration> registrations;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
        Assertions.assertNotNull(configuration);
        Assertions.assertEquals("101", configuration.getId());
        Assertions.assertEquals(2, configuration.getCustomConfigs().size());
        Assertions.assertEquals("apple", configuration.getCustomConfigs().get(0).getName());
        Assertions.assertEquals(Double.valueOf(20), configuration.getCustomConfigs().get(0).getPrice());
        Assertions.assertEquals("pear", configuration.getCustomConfigs().get(1).getName());
        Assertions.assertEquals(Double.valueOf(25), configuration.getCustomConfigs().get(1).getPrice());

        Assertions.assertNotNull(registrations);
        Assertions.assertEquals(2, registrations.size());
        Assertions.assertEquals("<svc>", registrations.get(0).getName());
        Assertions.assertEquals("<url>", registrations.get(0).getAdminURL());
        Assertions.assertEquals("<svc1>", registrations.get(1).getName());
        Assertions.assertEquals("<url1>", registrations.get(1).getAdminURL());
    }

}
