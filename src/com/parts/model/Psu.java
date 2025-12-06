package com.parts.model;

public class Psu extends Component {
    // Properties for compatibility checking
    private String size;
    
    // PSU-specific properties
    private int outputWattage;
    private String efficiencyRating;

    public Psu(String id, String name, String manufacturer, double price,
               String size, int outputWattage, String efficiencyRating) {
        super(id, name, manufacturer, price);
        this.size = size;
        this.outputWattage = outputWattage;
        this.efficiencyRating = efficiencyRating;
    }

    public String getSize() { return size; }
    public int outputWattage() { return outputWattage; }
    public String getEfficiencyRating() { return efficiencyRating; }

    @Override
    public String toString() {
        return String.format("%s %d W", super.toString(), outputWattage);
    }

}
