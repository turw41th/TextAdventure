package com.world;

public abstract class InventoryObject {

    private final int cost;
    private final String name;
    private final String type;


    public InventoryObject(int cost, String name, String type){
        this.cost = cost;
        this.name = name;
        this.type = type;
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
}
