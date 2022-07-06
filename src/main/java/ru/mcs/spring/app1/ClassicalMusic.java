package ru.mcs.spring.app1;

import org.springframework.stereotype.Component;

@Component("classicMusicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
