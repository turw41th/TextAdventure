package com.world;

import java.util.ArrayList;
import java.util.Random;

public class World {

    private ArrayList<Location> locations;
    private ArrayList<Enemy> enemies;

    private Location currentLocation;
    private final Player player;

    public World(String playername) {

        this.locations = new ArrayList<>();
        this.enemies = new ArrayList<>();
        player = new Player(playername);
        generateLocations();
        generateWeaponItems();
        generateItems();
        generateEnemies();
    }


    public Player getPlayer() {
        return player;
    }

    public String getCurrentSituation(){
        String situation = "Current Location: " + this.currentLocation.getName() + "\n";
        /*
        if (!this.currentLocation.isVisited()) {
            situation += "____________________________\n" + this.currentLocation.getDescription();
            this.currentLocation.setVisited();
        }
        */
        return situation;
    }

    public String getCurrentSituationDetailed(){
        String situation = "Current Location: " + this.currentLocation.getName() + "\n"
                + "____________________________\n" + this.currentLocation.getDescription();
        return situation;
    }



    private void generateLocations(){
        Location spireByFire = new Location("Spire by Fire Tavern", "This is the Spire by Fire Tavern. Have a beer and make some friends!");
        locations.add(spireByFire);
        Location blackwoodCastle = new Location("Blackwood Castle", "Welcome to Blackwood castle, a place to rest from your adventures");
        locations.add(blackwoodCastle);


        this.currentLocation = spireByFire;
    }



    private void generateWeaponItems(){
        player.addWeaponToInventory(new Weapon(20, "Dagger", "melee", "Just a regular dagger", 5));
        player.addWeaponToInventory(new Weapon(30, "Shortsword", "melee", "A shortsword for a trained warrior", 10));
        player.addWeaponToInventory(new Weapon(15, "Mace", "melee", "Regular mace", 7));

    }

    private void generateItems(){
        player.addItemToInventory(new Item(5, "SilverCoin", "item", "A random coin you have found on the street"));
        player.addItemToInventory(new Item(3, "Mug", "item", "A nice mug with a cat on it"));

    }

    private void generateEnemies(){
        enemies.add(new Enemy("Orc", "A regular, pretty ugly orc", 15, 7));
        enemies.add(new Enemy("Goblin", "Goblin", 10, 5));
        enemies.add(new Enemy("Wolf", "A blood thristy wolf", 4, 5));
    }

}
