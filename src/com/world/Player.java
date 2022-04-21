package com.world;

import java.util.ArrayList;

public class Player {

    private final String name;
    private int health = 100;
    private int level = 1;
    private int currency = 20;
    private ArrayList<InventoryObject> inventory = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public void healUp(int i){
        this.health += i;
    }

    public void takeDamage(int i){
        this.health -= i;
    }

    public void levelUp(){
        this.level += 1;
    }

    public int getLevel() {
        return this.level;
    }

    public int getCurrency() {
        return currency;
    }

    public void addCurrency(int amount){
        currency += amount;
    }

    public void spendCurrency(int amount){
        currency -= amount;
    }

    public void AddItemToInventory(InventoryObject object){
        inventory.add(object);
    }

    public void GetAllWeapons(){
        ArrayList<WeaponObject> weapons = new ArrayList<>();
        for(InventoryObject io : inventory){
            if(io.getType()==InventoryObject.Type.WEAPON){
                weapons.add((WeaponObject) io);
            }
        }
    }

    private class WeaponObject extends InventoryObject{
        public WeaponObject(int cost, String name){
            super(cost,name);
        }
    }
}