package ru.mcs.spring.app1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public void doInit() {
        System.out.println("Initialization");
    }

    public void doDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
