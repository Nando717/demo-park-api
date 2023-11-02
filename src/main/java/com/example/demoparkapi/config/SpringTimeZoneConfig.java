package com.example.demoparkapi.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {
    public void timezoneConfig(){

        @PostConstruct
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}
