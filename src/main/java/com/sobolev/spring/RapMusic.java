package com.sobolev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RapMusic implements Music {
    private List<String> listSong;

    public RapMusic() {
        listSong = new ArrayList<>();
        Collections.addAll(listSong,"Asphalt 8", "Gangsta Paradise", "Bumer");
    }
    @Override
    public String getSong() {
        return listSong.get((int) (Math.random()*3));
    }
}
