package ru.mcs.spring.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musicGenre == MusicGenre.CLASSICAL) {
            return "Playing: " + classicalMusic.getSongs().get(randomNumber);
        }
        if (musicGenre == MusicGenre.ROCK) {
            return "Playing: " + rockMusic.getSongs().get(randomNumber);
        }
        return "Playing: " + classicalMusic.getSongs() + ", " + rockMusic.getSongs();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
