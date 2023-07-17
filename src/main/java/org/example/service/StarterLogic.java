package org.example.service;

import java.time.LocalDateTime;
import org.example.config.StarterProperties;



public class StarterLogic {

    private StarterProperties properties;


    public StarterLogic(StarterProperties properties) {
        this.properties = properties;
    }

    public String  doSomeStarterLogic(){
        return String.format("this is starter Logic at %s and from %s ", LocalDateTime.now(), properties.getAuthor());
    }
}
