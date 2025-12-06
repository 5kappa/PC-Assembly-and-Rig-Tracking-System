package com.parts.model;

import java.util.ArrayList;
import java.util.List;

public class CpuCooler extends Component {
    // Properties for compatibility checking
    private int heightMm;
    private List<String> supportedSockets;

    private int tdpRating;
    private boolean supportsAdditionalFans;
    private String fanRPM;                  // ! NOT IN DATASET
    private String noiseLevelDb;            // ! NOT IN DATASET

    public CpuCooler(String id, String name, String manufacturer, double price,
                     int heightMm, String supportedSocketsCsv, int tdpRating,
                     boolean supportsAdditionalFans, String fanRPM, String noiseLevelDb) {
       
        super(id, name, manufacturer, price);

        this.heightMm = heightMm;
        this.tdpRating = tdpRating;
        this.supportsAdditionalFans = supportsAdditionalFans;
        this.fanRPM = fanRPM;
        this.noiseLevelDb = noiseLevelDb;

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
    public int getTdpRating() { return tdpRating; }
    public boolean supportsAdditionalFans() { return supportsAdditionalFans; }
    public String getFanRPM() { return fanRPM; }
    public String getNoiseLevelDb() { return noiseLevelDb; }

    @Override
    public String toString() {
        return String.format("%s [TDP: %dW, Height: %dmm, Noise: %s]",
                             super.toString(), tdpRating, heightMm, noiseLevelDb);
    }
}
