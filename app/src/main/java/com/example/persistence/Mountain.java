package com.example.persistence;

public class Mountain {

    private int id;
    private String name;
    private int height;

    public Mountain(int id, String n, int h){
        id = id;
        name = n;
        height = h;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
