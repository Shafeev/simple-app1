package ru.mcs.spring.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
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

}
