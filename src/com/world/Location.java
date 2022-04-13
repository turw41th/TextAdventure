package com.world;

public class Location {

    private final String name;
    private String description;
    private boolean visited;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.visited = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(){
        this.visited = true;
    }
}
