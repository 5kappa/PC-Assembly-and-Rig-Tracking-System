package com.parts.model;

import java.util.List;

public class Motherboard extends Component {
    // Properties for compatibility checking
    private String socket;
    private String ramType;
    private int ramSlotCount;
    private int maxRamCapacityGBs;
    private List<String> supportedRamSpeeds;
    private String formFactor;
    private int pcieX16SlotCount;
    private int pcieX1SlotCount;
    private int pcieX4SlotCount;
    private int pcieX8SlotCount;

    // Motherboard-specific properties
    private String chipset;
    private boolean hasWifi;
    private String primaryColor;

    // Storage ports
    private int sataPortCount;
    private int m2SlotCount;
    private String m2SlotsDetailed;
    
    public Motherboard(String id, String name, String manufacturer, double price, String socket,
                       String ramType, int ramSlotCount, int maxRamCapacityGBs, String formFactor,
                       int pcieX16SlotCount, int pcieX1SlotCount, int pcieX4SlotCount,
                       int pcieX8SlotCount, String chipset, boolean hasWifi, String primaryColor,
                       int sataPortCount, int m2SlotCount) {

        super(id, name, manufacturer, price);

        this.socket = socket;
        this.ramType = ramType;
        this.ramSlotCount = ramSlotCount;
        this.maxRamCapacityGBs = maxRamCapacityGBs;
        this.formFactor = formFactor;
        this.pcieX16SlotCount = pcieX16SlotCount;
        this.pcieX1SlotCount = pcieX1SlotCount;
        this.pcieX4SlotCount = pcieX4SlotCount;
        this.pcieX8SlotCount = pcieX8SlotCount;

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
    public List<String> getSupportedRamSpeeds() { return supportedRamSpeeds; }
    public String getFormFactor() { return formFactor; }
    public int getPcieX16SlotCount() { return pcieX16SlotCount; }
    public int getPcieX1SlotCount() { return pcieX1SlotCount; }
    public int getPcieX4SlotCount() { return pcieX4SlotCount; }
    public int getPcieX8SlotCount() { return pcieX8SlotCount; }

    public String getChipset() { return chipset; }
    public boolean hasWifi() { return hasWifi; }
    public String getPrimaryColor() { return primaryColor; }

    public int getSata3PortCount() { return sataPortCount; }
    public int getM2SlotCount() { return m2SlotCount; }
    public String getM2SlotsDetailed() { return m2SlotsDetailed; }
    
    @Override
    public String toString() {
        return String.format("%s [%s Socket, %s, %s]", 
            super.toString(), socket, formFactor, chipset);
    }
}
