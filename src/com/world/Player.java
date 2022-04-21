package com.world;

public class Player {

    private final String name;
    private int health = 100;
    private int level = 1;

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
<<<<<<< Updated upstream
=======

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


>>>>>>> Stashed changes
}