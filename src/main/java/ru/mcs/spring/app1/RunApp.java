package ru.mcs.spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();


        Music classicMusic = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(classicMusic);
        musicPlayer2.playMusic();
        context.close();
    }
}
