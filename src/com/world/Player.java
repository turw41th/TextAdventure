package com.world;

import java.util.ArrayList;

public class Player {

    private final String name;
    private int health = 100;
    private int level = 1;
    private int currency = 100;
    private ArrayList<Weapon> weaponInventory = new ArrayList<>();
    private ArrayList<Item> itemInventory = new ArrayList<>();

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
        if (this.getCurrency() >= amount){
            currency -= amount;
        } else {
            System.out.println("You don't have enough money to do this. You only have " + getCurrency() + "!");
        }

    }

    public void addWeaponToInventory(Weapon weapon){
        weaponInventory.add(weapon);
    }

    public void addItemToInventory(Item item){
        itemInventory.add(item);
    }

    public String listInventory(){
        StringBuilder inventory = new StringBuilder("Weapons:\n-----------------\n");
        for (Weapon weapon : weaponInventory){
            inventory.append(weapon.getInformation()).append("\n\n");
        }
        inventory.append("Items:\n-----------------\n");
        for (Item item : itemInventory){
            inventory.append(item.getInformation()).append("\n");
        }
        return inventory.toString();
    }


}