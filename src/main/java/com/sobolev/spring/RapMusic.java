package com.sobolev.spring;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    private RapMusic(){}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Asphalt 8";
    }
    public void myInitMethod(){
        System.out.println("RapMusic init");
    }
    public void myDestroyMethod(){
        System.out.println("RapMusic destroy");
    }
}
