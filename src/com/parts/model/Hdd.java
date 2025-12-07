package com.parts.model;

public class Hdd extends Component {
    // Properties for compatibility checking
    private String formFactorInches;

    // HDD-specific properties
    private int sizeTB;
    private int RPM;
    private int cache;

    public Hdd(String id, String name, String manufacturer, double price,
               String formFactorInches, int sizeTB, int RPM, int cache) {
        
        super(id, name, manufacturer, price);

        this.formFactorInches = formFactorInches;
        this.sizeTB = sizeTB;
        this.RPM = RPM;
        this.cache = cache;
    }

    public String getFormFactorInches() { return formFactorInches; }
    public int getSizeTB() { return sizeTB; }
    public int getRPM() { return RPM; }
    public int getCache() { return cache; }

    @Override
    public String toString() {
        return String.format("%s %dTB", super.toString(), sizeTB);
    }
}
