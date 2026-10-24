package com.isaachome.designpattern.problem;

public class House {
    private int walls;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasStatues;
    private boolean hasGarden;

    public House(int walls, int doors, int rooms, boolean hasGarage, boolean hasSwimmingPool, boolean hasStatues, boolean hasGarden) {
        this.walls = walls;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }
}
