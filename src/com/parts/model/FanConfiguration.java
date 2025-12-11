package com.parts.model;

public record FanConfiguration(int sizeMm, int maxQuantity) {
    @Override
    public String toString() {
        return maxQuantity + "x" + sizeMm + "mm";
    }
}