package ru.mcs.spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Computer computer = context.getBean("computer", Computer.class);
       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicGenre.ROCK));
        System.out.println(musicPlayer.playMusic(MusicGenre.CLASSICAL));
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
