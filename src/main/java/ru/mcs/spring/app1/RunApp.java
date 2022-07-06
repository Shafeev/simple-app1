package ru.mcs.spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());

        RockMusic rockMusic2 = context.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic2.getSong());

//        RockMusic rockMusic2 = context.getBean("musicBean", RockMusic.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
