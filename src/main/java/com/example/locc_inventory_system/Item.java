package com.example.locc_inventory_system;

public class Item implements ItemAction{

private int item_id;
private int item_type;
private String item_name;
private String item_description;
private double item_weight;
private double item_value;


    public Item() {}// Empty constructor
    public Item(int item_id, int item_type, String item_name, String item_description, double item_weight, double item_value) {
        this.item_id = item_id;
        this.item_type = item_type;
        this.item_name = item_name;
        this.item_description = item_description;
        this.item_weight = item_weight;
        this.item_value = item_value;
    }// Full Constructor

    //region Getters & Setters
    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getItem_type() {
        return item_type;
    }

    public void setItem_type(int item_type) {
        this.item_type = item_type;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_weight() {
        return item_weight;
    }

    public void setItem_weight(double item_weight) {
        this.item_weight = item_weight;
    }

    public double getItem_value() {
        return item_value;
    }

    public void setItem_value(double item_value) {
        this.item_value = item_value;
    }
    //endregion

    @Override
    public void showItemInfo() {

    }

    @Override
    public void useItem(){

    }


}// End
