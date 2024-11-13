package com.sobolev.spring;

import org.springframework.stereotype.Component;


public class RapMusic implements Music {

    private RapMusic(){}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Asphalt 8";
    }
}
