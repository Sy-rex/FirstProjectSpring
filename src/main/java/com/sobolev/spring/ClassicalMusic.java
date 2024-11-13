package com.sobolev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> listSong;

    public ClassicalMusic() {
        listSong = new ArrayList<>();
        Collections.addAll(listSong,"Besame Mucho", "La Campanella","Fur Elise");
    }
    @Override
    public String getSong() {
        return listSong.get((int) (Math.random()*3));
    }
}
