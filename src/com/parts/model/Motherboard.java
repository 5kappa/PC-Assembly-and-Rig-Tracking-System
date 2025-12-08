package com.parts.model;

public class Motherboard extends Component {
    // Properties for compatibility checking
    private String socket;
    private String ramType;
    private int ramSlotCount;
    private int maxRamCapacityGBs;
    private String formFactor;

    // Motherboard-specific properties
    private String chipset;
    private boolean hasWifi;
    private String primaryColor;

    // Storage ports
    private int sataPortCount;
    private int m2SlotCount;            // ! NOT IN DATASET
    
    public Motherboard(String id, String name, String manufacturer, double price, String socket,
                       String ramType, int ramSlotCount, String formFactor, String chipset,
                       int maxRamCapacityGBs, String primaryColor, int sataPortCount,
                       int m2SlotCount, boolean hasWifi) {

        super(id, name, manufacturer, price);

        this.socket = socket;
        this.ramType = ramType;
        this.ramSlotCount = ramSlotCount;
        this.maxRamCapacityGBs = maxRamCapacityGBs;
        this.formFactor = formFactor;

        this.chipset = chipset;
        this.hasWifi = hasWifi;
        this.primaryColor = primaryColor;

        this.sataPortCount = sataPortCount;
        this.m2SlotCount = m2SlotCount;
    }

    public String getSocket() { return socket; }
    public String getRamType() { return ramType; }
    public int getRamSlotCount() { return ramSlotCount; }
    public int getMaxRamCapacityGBs() { return maxRamCapacityGBs; }
    public String getFormFactor() { return formFactor; }

    public String getChipset() { return chipset; }
    public boolean hasWifi() { return hasWifi; }
    public String getPrimaryColor() { return primaryColor; }

    public int getSataPortCount() { return sataPortCount; }
    public int getM2SlotCount() { return m2SlotCount; }
    
    
    @Override
    public String toString() {
        return String.format("%s [%s Socket, %s, %s]", 
            super.toString(), socket, formFactor, chipset);
    }
}
