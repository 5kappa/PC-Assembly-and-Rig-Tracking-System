package com.parts.model;

public class Hdd extends Component {
    // Properties for compatibility checking
    private String formFactorInches;
    private String interfaceType;

    // HDD-specific properties
    private int sizeTB;
    private int RPM;
    private int cache;

    public Hdd(String id, String name, String manufacturer, double price,
               String formFactorInches, String interfaceType, int sizeTB,
               int RPM, int cache) {
        
        super(id, name, manufacturer, price);

        this.formFactorInches = formFactorInches;
        this.interfaceType = interfaceType;

        this.sizeTB = sizeTB;
        this.RPM = RPM;
        this.cache = cache;
    }

    public String getFormFactorInches() { return formFactorInches; }
    public String getInterfaceType() { return interfaceType; }

    public int getSizeTB() { return sizeTB; }
    public int getRPM() { return RPM; }
    public int getCache() { return cache; }

    @Override
    public String toString() {
        return String.format("%s %dTB", super.toString(), sizeTB);
    }
}