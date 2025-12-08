package com.parts.model;

public class Psu extends Component {
    // Properties for compatibility checking
    private String size;
    private int eps8PinCount;           // CPU
    private int pcie6Plus2PinCount;     // GPU
    private int pcie12PinCount;         // High-end GPU
    private int pcie16Pin12VHPWRCount;  // RTX 40 series GPUs
    private int sataCount;              // Drives

    // Legacy connectors
    private int atx4PinCount;           // CPU
    private int pcie6PinCount;          // GPU
    private int pcie8PinCount;          // GPU
    private int ampMolex4PinCount;      // Drives
    
    // PSU-specific properties
    private int outputWattage;
    private String efficiencyRating;
    private String modularity;
    private String color;
    private boolean isFanless;


    public Psu(String id, String name, String manufacturer, double price, String size,
               int eps8PinCount, int pcie6Plus2PinCount, int pcie12PinCount, int pcie16Pin12VHPWRCount,
               int sataCount, int atx4PinCount, int pcie6PinCount, int pcie8PinCount,
               int ampMolex4PinCount, int outputWattage, String efficiencyRating,
               String modularity, String color, boolean isFanless) {

        super(id, name, manufacturer, price);

        this.size = size;
        this.eps8PinCount = eps8PinCount;
        this.pcie6Plus2PinCount = pcie6Plus2PinCount;
        this.pcie12PinCount = pcie12PinCount;
        this.sataCount = sataCount;
        this.atx4PinCount = atx4PinCount;
        this.pcie6PinCount = pcie6PinCount;
        this.pcie8PinCount = pcie8PinCount;
        this.ampMolex4PinCount = ampMolex4PinCount;

        this.outputWattage = outputWattage;
        this.efficiencyRating = efficiencyRating;
        this.modularity = modularity;
        this.color = color;
        this.isFanless = isFanless;
    }

    public String getSize() { return size; }
    public int getEps8PinCount() { return eps8PinCount; }
    public int getPcie6Plus2PinCount() { return pcie6Plus2PinCount; }
    public int getPcie12PinCount() { return pcie12PinCount; }
    public int getSataCount() { return sataCount; }
    public int getAtx4PinCount() { return atx4PinCount; }
    public int getPcie6PinCount() { return pcie6PinCount; }
    public int getPcie8PinCount() { return pcie8PinCount; }
    public int getAmpMolex4PinCount() { return ampMolex4PinCount; }
    
    public int getOutputWattage() { return outputWattage; }
    public String getEfficiencyRating() { return efficiencyRating; }
    public String getModularity() { return modularity; }
    public String getColor() { return color; }
    public boolean isFanless() { return isFanless; }

    @Override
    public String toString() {
        return String.format("%s %d W", super.toString(), outputWattage);
    }

}
