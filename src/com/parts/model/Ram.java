package com.parts.model;

// If voltage > 1.5V, warn user about its compatibility with the mobo. Some entry-level mobos cannot supply 1.5V to RAM

public class Ram extends Component {
    // Properties for compatibility checking
    private String ramType;
    private String speed;
    private int moduleCount;
    private int capacityGBs;
    private String formFactor;

    // RAM-specific properties
    private int frequencyMHz;
    private String color;
    private int casLatency;
    private float firstWordLatency;
    private float voltage;
    private boolean isECC;
    private boolean isRegistered;
    private boolean hasHeatSpreader;

    public Ram(String id, String name, String manufacturer, double price, String ramType,
               String speed, int moduleCount, int capacityGBs, String formFactor,
               int frequencyMHz, String color, int casLatency, float firstWordLatency,
               float voltage, boolean isECC, boolean isRegistered, boolean hasHeatSpreader) {

        super(id, name, manufacturer, price);
        this.ramType = ramType;
        this.speed = speed;
        this.moduleCount = moduleCount;
        this.capacityGBs = capacityGBs;
        this.formFactor = formFactor;

        this.frequencyMHz = frequencyMHz;
        this.color = color;
        this.casLatency = casLatency;
        this.firstWordLatency = firstWordLatency;
        this.voltage = voltage;
        this.isECC = isECC;
        this.isRegistered = isRegistered;
        this.hasHeatSpreader = hasHeatSpreader;
    }

    public String getRamType() { return ramType; }
    public String getSpeed() { return speed; }
    public int getModuleCount() { return moduleCount; }
    public int getCapacityGBs() { return capacityGBs; }
    public String getFormFactor() { return formFactor; }

    public int getFrequencyMHz() { return frequencyMHz; }
    public String getColor() { return color; }
    public int getCasLatency() { return casLatency; }
    public float getFirstWordLatency() { return firstWordLatency; }
    public float getVoltage() { return voltage; }
    public boolean isECC() { return isECC; }
    public boolean isRegistered() { return isRegistered; }
    public boolean hasHeatSpreader() { return hasHeatSpreader; }

    @Override
    public String toString() {
        return String.format("%s, [%s GB, %s, x%d Modules]", super.toString(), capacityGBs, ramType, moduleCount);
    }
}