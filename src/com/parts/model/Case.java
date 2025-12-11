package com.parts.model;

/**
 * Limitations:
 * Infer supportedPsuSizes using caseType, then user does a manual check
 * maxPossibleCpuCoolerHeightMm = widthMm - 50 mm, then user does a manual check
 * Once user verifies compatibility, allow saves
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Case extends Component {
    // Properties for compatibility checks
    private int maxGpuLengthMm;
    private int includedPsuWatts;
    private List<MotherboardFormFactor> supportedMotherboards;
    private List<IncludedFanGroup> includedFans;
        // Drives
    private int external525BayCount;
    private int external35BayCount;
    private int internal35BayCount;
    private int internal25BayCount;
        // Expansion Slots
    private int fullHeightExpansionSlotCount;
    private int halfHeightExpansionSlotCount;
    private int verticalExpansionSlotCount;

    private Map<String, List<FanConfiguration>> fanSupport;     // [Position]: [Qty] x [LengthMm]
    private Map<String, List<Integer>> radiatorSupport;         // [Position]: [List<LengthMm>]

    // Case-specific properties
    private String caseType;
    private String color;
    private String sidePanel;
    private boolean hasPsuShroud;
    private Map<String, Integer> frontPanelPorts;

    // Dimensions
    private int heightMm;
    private int widthMm;
    private int depthMm;
    private float volumeLiters;

    // Constructor
    public Case(String id, String name, String manufacturer, double price, int maxGpuLengthMm,
                int includedPsuWatts, List<MotherboardFormFactor> supportedMotherboards,
                List<IncludedFanGroup> includedFans, int external525BayCount,
                int external35BayCount, int internal35BayCount, int internal25BayCount,
                int fullHeightExpansionSlotCount, int halfHeightExpansionSlotCount,
                int verticalExpansionSlotCount, Map<String, List<FanConfiguration>> fanSupport,
                Map<String, List<Integer>> radiatorSupport, String caseType, String color,
                String sidePanel, boolean hasPsuShroud, Map<String, Integer> frontPanelPorts,
                int heightMm, int widthMm, int depthMm, float volumeLiters) {

        super(id, name, manufacturer, price);
        
        this.maxGpuLengthMm = maxGpuLengthMm;
        this.includedPsuWatts = includedPsuWatts;
        this.supportedMotherboards = new ArrayList<>();
        this.includedFans = new ArrayList<>();

        this.external525BayCount = external525BayCount;
        this.external35BayCount = external35BayCount;
        this.internal35BayCount = internal35BayCount;
        this.internal25BayCount = internal25BayCount;

        this.fullHeightExpansionSlotCount = fullHeightExpansionSlotCount;
        this.halfHeightExpansionSlotCount = halfHeightExpansionSlotCount;
        this.verticalExpansionSlotCount = verticalExpansionSlotCount;

        this.fanSupport = new LinkedHashMap<>();
        this.radiatorSupport = new LinkedHashMap<>();

        this.caseType = caseType;
        this.color = color;
        this.sidePanel = sidePanel;
        this.hasPsuShroud = hasPsuShroud;
        this.frontPanelPorts = new LinkedHashMap<>();
        
        this.heightMm = heightMm;
        this.widthMm = widthMm;
        this.depthMm = depthMm;
        this.volumeLiters = volumeLiters;
    }

    public void addSupportedFormFactor(MotherboardFormFactor ff) {
        this.supportedMotherboards.add(ff);
    }

    public void addIncludedFanGroup(IncludedFanGroup fanGroup) {
        this.includedFans.add(fanGroup);
    }

    public boolean hasIncludedPsu() { return includedPsuWatts > 0; }

    public int getMaxGpuLengthMm() { return maxGpuLengthMm; }
    public int getIncludedPsuWatts() { return includedPsuWatts; }
    public List<MotherboardFormFactor> getSupportedMotherboards() { return supportedMotherboards; }
    public List<IncludedFanGroup> getIncludedFans() { return includedFans; }

    public int getExternal525BayCount() { return external525BayCount; }
    public int getExternal35BayCount() { return external35BayCount; }
    public int getInternal35BayCount() { return internal35BayCount; }
    public int getInternal25BayCount() { return internal25BayCount; }
    
    public int getFullHeightExpansionSlotCount() { return fullHeightExpansionSlotCount; }
    public int getHalfHeightExpansionSlotCount() { return halfHeightExpansionSlotCount; }
    public int getVerticalExpansionSlotCount() { return verticalExpansionSlotCount; }

    public Map<String, List<FanConfiguration>> getFanSupport() { return fanSupport; }
    public Map<String, List<Integer>> getRadiatorSupport() { return radiatorSupport; }
    
    public String getCaseType() { return caseType; }
    public String getColor() { return color; }
    public String getSidePanel() { return sidePanel; }
    public boolean hasPsuShroud() { return hasPsuShroud; }
    public Map<String, Integer> getFrontPanelPorts() { return frontPanelPorts; }

    public int getHeightMm() { return heightMm; }
    public int getWidthMm() { return widthMm; }
    public int depthMm() { return depthMm; }
    public float getVolumeLiters() { return volumeLiters; }

    @Override
    public String toString() {
        return String.format("%s [%s, Vol: %.1fL]", super.toString(), caseType, volumeLiters);
    }
}