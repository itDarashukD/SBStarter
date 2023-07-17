package org.example.config;

import org.example.service.StarterLogic;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterConfiguration {

    @Bean
    public StarterLogic starterLogic(StarterProperties properties){
        return new StarterLogic(properties);
    }


}
