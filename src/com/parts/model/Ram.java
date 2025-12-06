package com.parts.model;

public class Ram extends Component {
    // Properties for compatibility checking
    private String ramType;
    private int moduleCount;

    // RAM-specific properties
    private int capacityGBs;
    private int speedMHz;
    private int casLatency;

    public Ram(String id, String name, String manufacturer, double price, String ramType,
               int moduleCount, int capacityGBs, int speedMHz, int casLatency) {
        super(id, name, manufacturer, price);
        this.ramType = ramType;
        this.moduleCount = moduleCount;
        this.capacityGBs = capacityGBs;
        this.speedMHz = speedMHz;
        this.casLatency = casLatency;
    }

    public String getRamType() { return ramType; }
    public int getModuleCount() { return moduleCount; }
    public int getCapacityGBs() { return capacityGBs; }
    public int getSpeedMHz() { return speedMHz; }
    public int getCasLatency() { return casLatency; }

    @Override
    public String toString() {
        return String.format("%s, [%s GB, %s, x%d Modules]", super.toString(), capacityGBs, ramType, moduleCount);
    }
}