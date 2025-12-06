package com.parts.model;

public class Gpu extends Component {
    // Properties for compatibility checking
    private int lengthMm;

    // GPU-specific properties
    private int vramGBs;
    private int boostClockMHz;
    private int tdpWatts;

    // Ports
    private int hdmiPortCount;
    private int displayPortCount;
    private int dviPortCount;
    private int vgaPortCount;

    public Gpu(String id, String name, String manufacturer, double price, int gpuLengthMm,
               int vramGBs, int boostClockMHz, int tdpWatts, int hdmiPortCount, int displayPortCount,
               int dviPortCount, int vgaPortCount) {
        super(id, name, manufacturer, price);
        this.lengthMm = gpuLengthMm;
        this.vramGBs = vramGBs;
        this.boostClockMHz = boostClockMHz;
        this.tdpWatts = tdpWatts;
        this.hdmiPortCount = hdmiPortCount;
        this.displayPortCount = displayPortCount;
        this.dviPortCount = dviPortCount;
        this.vgaPortCount = vgaPortCount;
    }

    public int getGpuLengthMm() { return lengthMm; }
    public int getVramGBs() { return vramGBs; }
    public int getBoostClockMHz() { return boostClockMHz; }
    public int getTdpWatts() { return tdpWatts; }
    public int getHdmiPortCount() { return hdmiPortCount; } 
    public int getDisplayPortCount() { return displayPortCount; }
    public int getDviPortCount() { return dviPortCount; }
    public int getVgaPortCount() { return vgaPortCount; }

    @Override
    public String toString() {
        return String.format("%s, %d GB", super.toString(), vramGBs);
    }

}
