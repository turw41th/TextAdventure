package com.world;

public abstract class InventoryObject {

    private final int cost;
    private final String name;

    private Type type;

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

    public Type getType(){
        return type;
    }

    public enum Type{ITEM,WEAPON};
}
