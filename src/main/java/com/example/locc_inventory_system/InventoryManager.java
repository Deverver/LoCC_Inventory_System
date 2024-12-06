package com.example.locc_inventory_system;

import java.util.ArrayList;

public class InventoryManager {
    private double goldAmount;
    private double weightLimit;
    private double currentWeight;
    private double remainingWeightCapacity;

    private Inventory playerInventory;
    private Inventory equipmentInventory;

    public InventoryManager() {}// Empty constructor
    public InventoryManager(double goldAmount, double weightLimit, double currentWeight, double remainingWeightCapacity, Inventory playerInventory, Inventory equipmentInventory) {
        this.goldAmount = goldAmount;
        this.weightLimit = weightLimit;
        this.currentWeight = currentWeight;
        this.remainingWeightCapacity = remainingWeightCapacity;
        this.playerInventory = playerInventory;
        this.equipmentInventory = equipmentInventory;
    }// Full Constructor

    //region Getters & Setters
    public double getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(double goldAmount) {
        this.goldAmount = goldAmount;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getRemainingWeightCapacity() {
        return remainingWeightCapacity;
    }

    public void setRemainingWeightCapacity(double remainingWeightCapacity) {
        this.remainingWeightCapacity = remainingWeightCapacity;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Inventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    public Inventory getEquipmentInventory() {
        return equipmentInventory;
    }

    public void setEquipmentInventory(Inventory equipmentInventory) {
        this.equipmentInventory = equipmentInventory;
    }
    //endregion

    public double getRemainingWeight() {
        setRemainingWeightCapacity(weightLimit - currentWeight);
        return remainingWeightCapacity;
    }





}// End
