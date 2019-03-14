package com.codedifferently.genius.models;

public class Artist {
    private long id;
    private String name;

    public Artist(long idIn, String nameIn){
        this.id = idIn;
        this.name = nameIn;
    }

    public Artist(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
