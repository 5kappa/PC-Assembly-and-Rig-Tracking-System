package com.parts.model;

import java.util.ArrayList;
import java.util.List;

// !! Need manual check if cooler is RGB/ARGB !!

public class CpuCooler extends Component {
    // Properties for compatibility checking
    private int heightMm;
    private int radiatorSizeMm;
    private List<String> supportedSockets;

    private boolean supportsAdditionalFans;
    private String fanRPM;
    private String noiseLevelDb;
    private int noiseLevelAverageDb;
    private String color;
    private boolean isWaterCooled;
    private boolean isFanless;

    public CpuCooler(String id, String name, String manufacturer, double price,
                     int heightMm, int radiatorSizeMm, String supportedSockets,
                     boolean supportsAdditionalFans, String fanRPM, String noiseLevelDb,
                     int noiseLevelAverageDb, String color, boolean isWaterCooled,
                     boolean isFanless) {
       
        super(id, name, manufacturer, price);

        this.heightMm = heightMm;
        this.radiatorSizeMm = radiatorSizeMm;
        this.supportsAdditionalFans = supportsAdditionalFans;
        this.fanRPM = fanRPM;
        this.noiseLevelDb = noiseLevelDb;
        this.noiseLevelAverageDb = noiseLevelAverageDb;
        this.color = color;
        this.isWaterCooled = isWaterCooled;
        this.isFanless = isFanless;

        this.supportedSockets = new ArrayList<>();
    }

    public int getHeightMm() { return heightMm; }
    public int getRadiatorSizeMm() { return radiatorSizeMm; }
    public List<String> getSupportedSockets() { return new ArrayList<>(supportedSockets); }

    public boolean supportsAdditionalFans() { return supportsAdditionalFans; }
    public String getFanRPM() { return fanRPM; }
    public String getNoiseLevelDb() { return noiseLevelDb; }
    public int getNoiseLevelAverageDb() { return noiseLevelAverageDb; }
    public String getColor() { return color; }
    public boolean isWaterCooled() { return isWaterCooled; }
    public boolean isFanless() { return isFanless; }

    @Override
    public String toString() {
        return String.format("%s [Height: %dmm, Noise: % Db]",
                             super.toString(), heightMm, noiseLevelAverageDb);
    }
}