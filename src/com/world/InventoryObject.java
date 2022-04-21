package com.world;

public abstract class InventoryObject {

    private final int cost;
    private final String name;


    public InventoryObject(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
    
}
