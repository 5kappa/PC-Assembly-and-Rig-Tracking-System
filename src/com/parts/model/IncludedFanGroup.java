package com.parts.model;

public class IncludedFanGroup {     // [Position]: [Qty] x [SizeMm] (LightingType)
    private String position;
    private int quantity;
    private int sizeMm;
    private String lightingType;

    public IncludedFanGroup(String position, int quantity, int sizeMm, String lightingType) {
        this.position = position;
        this.quantity = quantity;
        this.sizeMm = sizeMm;
        this.lightingType = lightingType;
    }

    public String getPosition() { return position; }
    public int getQuantity() { return quantity; }
    public int getSizeMm() { return sizeMm; }
    public String getRGBType() { return lightingType; }

    @Override
    public String toString() {
        return String.format("%dx %dmm %s (%s)", quantity, sizeMm, lightingType, position);
    }
}