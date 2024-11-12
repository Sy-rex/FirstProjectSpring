package com.sobolev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        RapMusic music = (RapMusic) context.getBean("rapBean",RapMusic.class);

        System.out.println(music.getSong());

        MusicPlayer firstmusicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);

//        boolean comparison = firstmusicPlayer == secondmusicPlayer;

//        System.out.println(comparison);

        firstmusicPlayer.setVolume(10);
        //musicPlayer.playMusic();
        System.out.println("Name musicPlayer: " + firstmusicPlayer.getName());
        System.out.println("Volume: " + firstmusicPlayer.getVolume());
        System.out.println("Name musicPlayer: " + secondmusicPlayer.getName());
        System.out.println("Volume: " + secondmusicPlayer.getVolume());
        context.close();
    }
}
