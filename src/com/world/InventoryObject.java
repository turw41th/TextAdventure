package com.world;

public abstract class InventoryObject {

    private final int cost;
    private final String name;
    private final String type;
    private String description;


    public InventoryObject(int cost, String name, String type, String description){
        this.cost = cost;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
