package com.example.musicplayer.music_list;

public class music {
    private String path;
    private String name;
    private int num;

    public music(String path,String name,int num){
        this.path = path;
        this.name = name;
        this.num = num;
    }

    public String getPath() {
        return path;
    }
    public String getName() {
        return name;
    }
    public int getNum(){
        return num;
    }
}
