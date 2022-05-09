package com.world;

public class Weapon extends InventoryObject{

    private int damage;

    public Weapon(int cost, String name, String type, String description, int damage) {
        super(cost, name, type, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getInformation(){
        String info;
        info = "Name: " + getName() + "\n"
                + "Cost: " + getCost() + "\n"
                + "Damage: " + getDamage() + "\n"
                + "Description: " + getDescription();
        return info;
    }
}
