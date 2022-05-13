package com.world;

public class Location {

    private final String name;
    private String description;
    private boolean visited;
    private Location nextLocation;
    private Location previousLocation;

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

    public void setNextLocation(Location nextLocation) {
        this.nextLocation = nextLocation;
    }

    public Location getNextLocation() {
        return nextLocation;
    }

    public void setPreviousLocation(Location previousLocation) {
        this.previousLocation = previousLocation;
    }

    public Location getPreviousLocation() {
        return previousLocation;
    }
}
