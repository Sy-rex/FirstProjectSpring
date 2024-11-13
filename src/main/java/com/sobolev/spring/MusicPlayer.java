package com.sobolev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> music;


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(Genre genre) {
        String song = "Playing song: ";
        switch (genre){
            case CLASSICAL:
                song+=music.get(2).getSong();
                break;
            case RAP:
                song+=music.get(1).getSong();
                break;
        }
        return song;
//        System.out.println("Playing music: " + classicalMusic.getSong());
//        System.out.println("Playing music: " + rockMusic.getSong());
    }
}
