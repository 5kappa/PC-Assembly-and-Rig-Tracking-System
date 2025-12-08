package com.parts.model;

import java.util.ArrayList;
import java.util.List;

public class CpuCooler extends Component {
    // Properties for compatibility checking
    private int heightMm;
    private List<String> supportedSockets;

    private boolean supportsAdditionalFans;
    private String fanRPM;                  // ! NOT IN DATASET
    private String noiseLevelDb;            // ! NOT IN DATASET
    private int noiseLevelAverageDb;
    private String color;
    private boolean isWaterCooled;
    private boolean isFanless;

    public CpuCooler(String id, String name, String manufacturer, double price,
                     int heightMm, String supportedSocketsCsv, boolean supportsAdditionalFans,
                     String fanRPM, String noiseLevelDb, int noiseLevelAverageDb,
                     String color, boolean isWaterCooled, boolean isFanless) {
       
        super(id, name, manufacturer, price);

        this.heightMm = heightMm;
        this.supportsAdditionalFans = supportsAdditionalFans;
        this.fanRPM = fanRPM;
        this.noiseLevelDb = noiseLevelDb;
        this.noiseLevelAverageDb = noiseLevelAverageDb;
        this.color = color;
        this.isWaterCooled = isWaterCooled;
        this.isFanless = isFanless;

        this.supportedSockets = new ArrayList<>();
        if (supportedSocketsCsv != null && !supportedSocketsCsv.isEmpty()) {
            String[] sockets = supportedSocketsCsv.split(",");
            for (String socket : sockets) {
                this.supportedSockets.add(socket.trim());
            }
        }
    }

    public int getHeightMm() { return heightMm; }
    public List<String> getSupportedSockets() { return supportedSockets; }

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
