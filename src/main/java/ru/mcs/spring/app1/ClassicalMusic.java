package ru.mcs.spring.app1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @Bean(initMethod = "")
    public void initMethod() {
        System.out.println("Classic music init");
    }

    @Bean(destroyMethod = "")
    public void destroyMethod() {
        System.out.println("Destroy music init");
    }
}
