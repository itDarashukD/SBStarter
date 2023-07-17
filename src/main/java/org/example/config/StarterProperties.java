package org.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "starter-copyright")
public class StarterProperties {

    private String author;

}
