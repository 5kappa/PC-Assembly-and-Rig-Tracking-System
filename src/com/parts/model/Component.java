package com.parts.model;

public abstract class Component {
    private String id;
    private String name;
    private String manufacturer;
    private double price;

    public Component (String id, String name, String manufacturer, double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getManufacturer() { return manufacturer; }
    public double getPrice() { return price; }
    
    @Override
    public String toString() {
        return name + " (₱" + price + ")";
    }
}
