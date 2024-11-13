package com.sobolev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer player = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
//        RapMusic music = (RapMusic) context.getBean("rapMusic",RapMusic.class);
//
//        System.out.println(music.getSong());
//
//        MusicPlayer firstmusicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);
//
////        boolean comparison = firstmusicPlayer == secondmusicPlayer;
//
////        System.out.println(comparison);
//
//        firstmusicPlayer.setVolume(10);
//        //musicPlayer.playMusic();
//        System.out.println("Name musicPlayer: " + firstmusicPlayer.getName());
//        System.out.println("Volume: " + firstmusicPlayer.getVolume());
//        System.out.println("Name musicPlayer: " + secondmusicPlayer.getName());
//        System.out.println("Volume: " + secondmusicPlayer.getVolume());
//        player.playMusic();
//        Computer computer = (Computer) context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = (ClassicalMusic) context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
    }
}
