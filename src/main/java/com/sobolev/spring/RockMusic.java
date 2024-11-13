package com.sobolev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RockMusic implements Music{
    private List<String> listSong;

    public RockMusic() {
        listSong = new ArrayList<>();
        Collections.addAll(listSong,"Where is My mind", "Believer", "Hero");
    }
    @Override
    public String getSong() {
        return listSong.get((int) (Math.random()*3));
    }
}
