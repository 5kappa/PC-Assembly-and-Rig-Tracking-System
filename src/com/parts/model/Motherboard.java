package com.parts.model;

public class Motherboard extends Component {
    // Properties for compatibility checking
    private String socket;
    private String ramType;
    private int ramSlotCount;
    private String formFactor;

    // Motherboard-specific properties
    private String chipset;
    private int maxRamCapacityGBs;
    private boolean isOverclockable;
    private boolean hasWifi;

    // Ports
    private int sataPortCount;
    private int m2SlotCount;            // ! NOT IN DATASET
    private int vgaPortCount;
    private int dviPortCount;
    private int hdmiPortCount;
    private int displayPortCount;
    
    public Motherboard(String id, String name, String manufacturer, double price, String socket,
                       String ramType, int ramSlotCount, String formFactor, String chipset, int maxRamCapacityGBs,
                       boolean isOverclockable, int sataPortCount, int m2SlotCount, int vgaPortCount, int dviPortCount,
                       int hdmiPortCount, int displayPortCount, boolean hasWifi) {
        super(id, name, manufacturer, price);
        this.socket = socket;
        this.ramType = ramType;
        this.ramSlotCount = ramSlotCount;
        this.formFactor = formFactor;
        this.chipset = chipset;
        this.maxRamCapacityGBs = maxRamCapacityGBs;
        this.isOverclockable = isOverclockable;
        this.sataPortCount = sataPortCount;
        this.m2SlotCount = m2SlotCount;
        this.vgaPortCount = vgaPortCount;
        this.dviPortCount = dviPortCount;
        this.hdmiPortCount = hdmiPortCount;
        this.displayPortCount = displayPortCount;
        this.hasWifi = hasWifi;
    }

    public String getSocket() { return socket; }
    public String getRamType() { return ramType; }
    public int getRamSlotCount() { return ramSlotCount; }
    public String getFormFactor() { return formFactor; }
    public String getChipset() { return chipset; }
    public int getMaxRamCapacityGBs() { return maxRamCapacityGBs; }
    public boolean isOverclockable() { return isOverclockable; }
    public int getSataPortCount() { return sataPortCount; }
    public int getM2SlotCount() { return m2SlotCount; }
    public int getVgaPortCount() { return vgaPortCount; }
    public int getDviPortCount() { return dviPortCount; }
    public int getHdmiPortCount() { return hdmiPortCount; }
    public int getDisplayPortCount() { return displayPortCount; }
    public boolean hasWifi() { return hasWifi; }
    
    @Override
    public String toString() {
        return String.format("%s [%s Socket, %s, %s]", 
            super.toString(), socket, formFactor, chipset);
    }
}
