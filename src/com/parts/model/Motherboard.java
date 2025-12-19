package com.parts.model;

// Missing fanHeaders; altho if a user runs out of headers they just buy a splitter/hub

public class Motherboard extends Component {
    // Properties for compatibility checking
    private String socket;
    private String ramType;
    private int ramSlotCount;
    private int maxRamCapacityGBs;
    private String formFactor;
    private int pcieX16SlotCount;
    private int pcieX1SlotCount;
    private int pcieX4SlotCount;
    private int pcieX8SlotCount;
    private int usb20HeaderCount;
    private int usb32Gen1HeaderCount;
    private int usb32Gen2HeaderCount;
    private int usb32Gen2x2HeaderCount;

    // Motherboard-specific properties
    private String chipset;
    private boolean hasWifi;
    private String primaryColor;

    // Storage ports
    private int sataPortCount;
    private int m2SlotCount;
    
    public Motherboard(String id, String name, String manufacturer, double price, String socket,
                       String ramType, int ramSlotCount, int maxRamCapacityGBs, String formFactor,
                       int pcieX16SlotCount, int pcieX1SlotCount, int pcieX4SlotCount,
                       int pcieX8SlotCount, int usb20HeaderCount, int usb32Gen1HeaderCount,
                       int usb32Gen2HeaderCount, int usb32Gen2x2HeaderCount, String chipset,
                       boolean hasWifi, String primaryColor, int sataPortCount, int m2SlotCount) {

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
        this.usb20HeaderCount = usb20HeaderCount;
        this.usb32Gen1HeaderCount = usb32Gen1HeaderCount;
        this.usb32Gen2HeaderCount = usb32Gen2HeaderCount;
        this.usb32Gen2x2HeaderCount = usb32Gen2x2HeaderCount;

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
    public int getPcieX16SlotCount() { return pcieX16SlotCount; }
    public int getPcieX1SlotCount() { return pcieX1SlotCount; }
    public int getPcieX4SlotCount() { return pcieX4SlotCount; }
    public int getPcieX8SlotCount() { return pcieX8SlotCount; }
    public int getUsb20HeaderCount() { return usb20HeaderCount; }
    public int getUsb32Gen1HeaderCount() { return usb32Gen1HeaderCount; }
    public int getUsb32Gen2HeaderCount() { return usb32Gen2HeaderCount; }
    public int getUsb32Gen2x2HeaderCount() { return usb32Gen2x2HeaderCount; }

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
