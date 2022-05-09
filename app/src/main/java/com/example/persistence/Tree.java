package com.example.persistence;

public class Tree {

    private int id;
    private String name;
    private int height;

    public Tree(int id, String n, int h){
        id = id;
        name = n;
        height = h;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
