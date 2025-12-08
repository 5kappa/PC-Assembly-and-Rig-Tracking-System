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


    public Psu(String id, String name, String manufacturer, double price,
               String size, int outputWattage, String efficiencyRating) {
        super(id, name, manufacturer, price);
        this.size = size;
        this.outputWattage = outputWattage;
        this.efficiencyRating = efficiencyRating;
    }

    public String getSize() { return size; }
    public int getOutputWattage() { return outputWattage; }
    public String getEfficiencyRating() { return efficiencyRating; }

    @Override
    public String toString() {
        return String.format("%s %d W", super.toString(), outputWattage);
    }

}
