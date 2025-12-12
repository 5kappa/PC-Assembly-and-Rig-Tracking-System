package com.parts.model;

public class Cpu extends Component {
    // Properties for compatibility checking
    private String socket;
    private int memoryMaxGBs;
    private boolean includesCooler;

    // CPU-specific properties
    private String series;
    private String microarchitecture;
    private String coreFamily;
    private int coreCount;
    private int threadCount;
    private float baseClockGHz;
    private float boostClockGHz;
    private int l2CacheMBs;
    private int l3CacheMBs;
    private int tdpWatts;
    private String integratedGraphics;
    private boolean supportsEcc;
    private boolean hasSmt;
    private String smtType;

    public Cpu(String id, String name, String manufacturer, double price, String socket, int memoryMaxGBs,
               boolean includesCooler, String series, String microarchitecture, String coreFamily,
               int coreCount, int threadCount, float baseClockGHz, float boostClockGHz, int l2CacheMBs,
               int l3CacheMBs, int tdpWatts, String integratedGraphics, boolean supportsEcc,
               boolean hasSmt, String smtType) {

        super(id, name, manufacturer, price);

        this.socket = socket;
        this.memoryMaxGBs = memoryMaxGBs;
        this.includesCooler = includesCooler;

        this.series = series;
        this.microarchitecture = microarchitecture;
        this.coreFamily = coreFamily;
        this.coreCount = coreCount;
        this.threadCount = threadCount;
        this.baseClockGHz = baseClockGHz;
        this.boostClockGHz = boostClockGHz;
        this.l2CacheMBs = l2CacheMBs;
        this.l3CacheMBs = l3CacheMBs;
        this.tdpWatts = tdpWatts;
        this.integratedGraphics = integratedGraphics;
        this.supportsEcc = supportsEcc;
        this.hasSmt = hasSmt;
        this.smtType = smtType;
    }

    public String getSocket() { return socket; }
    public int getMemoryMaxGBs() { return memoryMaxGBs; }
    public boolean isIncludesCooler() { return includesCooler; }

    public String getSeries() { return series; }
    public String getMicroarchitecture() { return microarchitecture; }
    public String getCoreFamily() { return coreFamily; }
    public int getCoreCount() { return coreCount; }
    public int getThreadCount() { return threadCount; }
    public float getBaseClockGHz() { return baseClockGHz; }
    public float getBoostClockGHz() { return boostClockGHz; }
    public int getL2CacheMBs() { return l2CacheMBs; }
    public int getL3CacheMBs() { return l3CacheMBs; }
    public int getTdpWatts() { return tdpWatts; }
    public String getIntegratedGraphics() { return integratedGraphics; }
    public boolean supportsEcc() { return supportsEcc; }
    public boolean hasSmt() { return hasSmt; }
    public String getSmtType() { return smtType; }

    @Override
    public String toString() {
        return String.format("%s [Socket: %s, %d Cores/%d Threads, %.2fGHz Base]",
            super.toString(), socket, coreCount, threadCount, baseClockGHz);
    }
}
