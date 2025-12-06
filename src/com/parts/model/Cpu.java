package com.parts.model;

public class Cpu extends Component {
    // Properties for compatibility checking
    private String socket;

    // CPU-specific properties
    private int coreCount;
    private int threadCount;
    private double baseClock;
    private double turboClock;
    private int tdpWatts;
    private String integratedGraphics;
    private boolean isOverclockable;

    public Cpu(String id, String name, String manufacturer, double price, String socket, int coreCount,
               int threadCount, double baseClock, double turboClock, int tdpWatts, String integratedGraphics,
               boolean isOverclockable) {
        super(id, name, manufacturer, price);

        this.socket = socket;

        this.coreCount = coreCount;
        this.threadCount = threadCount;
        this.baseClock = baseClock;
        this.turboClock = turboClock;
        this.tdpWatts = tdpWatts;
        this.integratedGraphics = integratedGraphics;
        this.isOverclockable = isOverclockable;
    }

    public String getSocket() { return socket; }
    public int getCoreCount() { return coreCount; }
    public int getThreadCount() { return threadCount; }
    public double getBaseClock() { return baseClock; }
    public double getTurboClock() { return turboClock; }
    public int getTdpWatts() { return tdpWatts; }
    public String getIntegratedGraphics() { return integratedGraphics; }
    public boolean isOverclockable() { return isOverclockable; }
    
    @Override
    public String toString() {
        return String.format("%s [Socket: %s, %d Cores/%d Threads, %.1fGHz Base]", 
            super.toString(), socket, coreCount, threadCount, baseClock);
    }
}
