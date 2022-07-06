package ru.mcs.spring.app1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
//       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//       musicPlayer.playMusic();
        System.out.println(computer);

        context.close();
    }
}
