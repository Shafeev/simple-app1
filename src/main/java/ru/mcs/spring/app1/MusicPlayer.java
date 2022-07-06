package ru.mcs.spring.app1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList.addAll(musicList);
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void setMusic(List<Music> musicList) {
        this.musicList.addAll(musicList);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusic() {
        return musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
