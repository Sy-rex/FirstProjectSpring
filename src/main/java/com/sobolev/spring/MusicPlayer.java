package com.sobolev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
        this.music = new ArrayList<Music>();
    };

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing music:");
        for (Music music : music) {
            System.out.println(music.getSong());
        }
    }

    public void myInitMethod() {
        System.out.println("Music player initialized");
    }

    public void myDestroyMethod() {
        System.out.println("Music player destroyed");
    }
}
