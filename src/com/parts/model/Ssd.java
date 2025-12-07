package com.parts.model;

public class Ssd extends Component {
    // Properties for compatibility checks
    private String interfaceType;               // ! NOT IN DATASET

    // SSD-specific properties
    private String formFactor;
    private String protocol;
    private int capacityGBs;
    private boolean isNVMe;

    public Ssd(String id, String name, String manufacturer, double price,
               String interfaceType, String formFactor, String protocol,
               int capacityGBs, boolean isNVMe) {
    
        super(id, name, manufacturer, price);

        this.interfaceType = interfaceType;

        this.formFactor = formFactor;
        this.protocol = protocol;
        this.capacityGBs = capacityGBs;
        this.isNVMe = isNVMe;
    }

    public String getInterfaceType() { return interfaceType; }
    public String getFormFactor() { return formFactor; }
    public String getProtocol() { return protocol; }
    public int getCapacityGBs() { return capacityGBs; }
    public boolean isNVMe() { return isNVMe; }

    @Override
    public String toString() {
        return String.format("%s %d GB", super.toString(), capacityGBs);
    }
}
