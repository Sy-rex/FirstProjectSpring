package com.sobolev.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return listSong.get((int) (Math.random()*3));
    }
}
