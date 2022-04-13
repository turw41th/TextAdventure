package com.world;

import java.util.ArrayList;

public class World {

    private ArrayList<Location> locations;

    private Location currentLocation;

    public World() {

        this.locations = new ArrayList<>();

        generateLocations();

    }

    public String getCurrentSituation(){
        String situation = "Current Location: " + this.currentLocation.getName() + "\n";
        if (!this.currentLocation.isVisited()) {
            situation += "____________________________\n" + this.currentLocation.getDescription();
            this.currentLocation.setVisited();
        }

        return situation;
    }

    private void generateLocations(){
        Location spireByFire = new Location("Spire by Fire Tavern", "This is the Spire by Fire Tavern. Have a beer and make some friends!");
        locations.add(spireByFire);



        this.currentLocation = spireByFire;
    }


}
