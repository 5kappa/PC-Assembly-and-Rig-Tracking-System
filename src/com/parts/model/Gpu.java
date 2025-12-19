package com.parts.model;

import java.util.ArrayList;
import java.util.List;

public class Gpu extends Component {
    // Properties for compatibility checking
    private String interfaceType;
    private List<String> requiredPowerConnectors;
    private int lengthMm;
    private int caseExpansionSlotWidth;
    private String profile;

    // GPU-specific properties
    private String graphicsProcessor;
    private int vramGBs;
    private String memoryType;
    private int coreClockMHz;
    private int boostClockMHz;
    private int tdpWatts;
    private String color;
    private String coolingType;

    // Ports
    private int hdmiPortCount;
    private int displayPortCount;

    public Gpu(String id, String name, String manufacturer, double price, String interfaceType,
               String requiredPowerConnectorsCsv, int lengthMm, int caseExpansionSlotWidth,
               String profile, String graphicsProcessor, int vramGBs, String memoryType,
               int coreClockMHz, int boostClockMHz, int tdpWatts, String color, String coolingType,
               int hdmiPortCount, int displayPortCount) {

        super(id, name, manufacturer, price);

        this.interfaceType = interfaceType;
        this.lengthMm = lengthMm;
        this.caseExpansionSlotWidth = caseExpansionSlotWidth;
        this.profile = profile;

        this.graphicsProcessor = graphicsProcessor;
        this.vramGBs = vramGBs;
        this.memoryType = memoryType;
        this.coreClockMHz = coreClockMHz;
        this.boostClockMHz = boostClockMHz;
        this.tdpWatts = tdpWatts;
        this.color = color;
        this.coolingType = coolingType;

        this.hdmiPortCount = hdmiPortCount;
        this.displayPortCount = displayPortCount;

        this.requiredPowerConnectors = new ArrayList<>();
    }

    public String getInterfaceType() { return interfaceType; }
    public List<String> getRequiredPowerConnectors() { return new ArrayList<>(requiredPowerConnectors); }
    public int getLengthMm() { return lengthMm; }
    public int getCaseExpansionSlotWidth() { return caseExpansionSlotWidth; }
    public String getProfile() { return profile; }

    public String getGraphicsProcessor() { return graphicsProcessor; }
    public int getVramGBs() { return vramGBs; }
    public String getMemoryType() { return memoryType; }
    public int getCoreClockMHz() { return coreClockMHz; }
    public int getBoostClockMHz() { return boostClockMHz; }
    public int getTdpWatts() { return tdpWatts; }
    public String getColor() { return color; }
    public String getCoolingType() { return coolingType; }

    public int getHdmiPortCount() { return hdmiPortCount; }
    public int getDisplayPortCount() { return displayPortCount; }

    @Override
    public String toString() {
        return String.format("%s, %d GB", super.toString(), vramGBs);
    }
}