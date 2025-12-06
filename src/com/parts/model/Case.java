package com.parts.model;

import java.util.ArrayList;
import java.util.List;

public class Case extends Component {
    // Properties for compatibility checking
    private List<String> supportedFormFactors;  // Note: replace "ATX" with "ATX, mATX, mITX"; etc.
    private List<String> supportedPsuSizes;
    private int maxCoolerHeightMm;
    private int maxGpuLengthMm;

    // Case-specific properties
    private int driveBay25Count;
    private int driveBay35Count;
    private int driveBayUniversalCount;
    private String primaryColor;
    private boolean hasWindow;
    private boolean hasDustFilter;
    private boolean hasCableManagement;
    private boolean hasNoiseIsolation;

    // Dimensions
    private int widthMm;
    private int depthMm;
    private int heightMm;

    public Case(String id, String name, String manufacturer, double price,
                String supportedFormsCsv, String supportedPsuCsv, int maxCoolerHeightMm,
                int maxGpuLengthMm, int driveBay25Count, int drivebay35Count, int driveBayUniversalCount,
                String primaryColor, boolean hasWindow, boolean hasDustFilter,
                boolean hasCableManagement, boolean hasNoiseIsolation, int widthMm,
                int depthMm, int heightMm) {

        super(id, name, manufacturer, price);

        this.maxCoolerHeightMm = maxCoolerHeightMm;
        this.maxGpuLengthMm = maxGpuLengthMm;

        this.driveBay25Count = driveBay25Count;
        this.driveBay35Count = drivebay35Count;
        this.driveBayUniversalCount = driveBayUniversalCount;
        this.primaryColor = primaryColor; 
        this.hasWindow = hasWindow;
        this.hasDustFilter = hasDustFilter;
        this.hasCableManagement = hasCableManagement;
        this.hasNoiseIsolation = hasNoiseIsolation;
        
        this.widthMm = widthMm;
        this.depthMm = depthMm;
        this.heightMm = heightMm;

        this.supportedFormFactors = new ArrayList<>();
        if (supportedFormsCsv != null && !supportedFormsCsv.isEmpty()) {
            String[] forms = supportedFormsCsv.split(",");
            for (String f : forms) {
                this.supportedFormFactors.add(f.trim());
            }
        }

        this.supportedPsuSizes = new ArrayList<>();
        if (supportedPsuCsv != null && !supportedPsuCsv.isEmpty()) {
            String[] psus = supportedPsuCsv.split(",");
            for (String p : psus) {
                this.supportedPsuSizes.add(p.trim());
            }
        }
    }

    public List<String> getSupportedFormFactors() { return supportedFormFactors; }
    public List<String> getSupportedPsuSizes() { return supportedPsuSizes; }
    public int getMaxCoolerHeightMm() { return maxCoolerHeightMm; }
    public int getMaxGpuLengthMm() { return maxGpuLengthMm; }

    public int getDriveBay25Count() { return driveBay25Count; }
    public int getDriveBay35Count() { return driveBay35Count; }
    public int getDriveBayUniversalCount() { return driveBayUniversalCount; }
    public String getPrimaryColor() { return primaryColor; }
    public boolean hasWindow() { return hasWindow; }
    public boolean hasDustFilter() { return hasDustFilter; }
    public boolean hasCableManagement() { return hasCableManagement; }
    public boolean hasNoiseIsolation() { return hasNoiseIsolation; }

    public int getWidthMm() { return widthMm; }
    public int getDepthMm() { return depthMm; }
    public int getHeightMm() { return heightMm; }

    @Override
    public String toString() {
        return String.format("%s, [Max GPU: %dmm, Max Cooler: %dmm, %s]",
                             super.toString(), maxGpuLengthMm, maxCoolerHeightMm, primaryColor);
    }
}