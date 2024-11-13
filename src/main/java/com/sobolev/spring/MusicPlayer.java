package com.sobolev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,@Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
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
                song+=music1.getSong();
                break;
            case RAP:
                song+=music2.getSong();
                break;
        }
        return song;
//        System.out.println("Playing music: " + classicalMusic.getSong());
//        System.out.println("Playing music: " + rockMusic.getSong());
    }
}
