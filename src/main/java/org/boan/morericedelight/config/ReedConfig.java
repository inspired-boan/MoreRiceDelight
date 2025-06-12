package org.boan.morericedelight.config;

public class ReedConfig {
    //@Comment({"A list of all the blocks this reed is allowed to grow on."})
    public String[] growBlocks;

    //@Comment({"Decreases reed growth speed. This reed will grow at",
    //          "{1/slowdown} times the rate of sugarcane."})
    public int slowdown;

    public ReedConfig(String[] growBlocks, int slowdown) {
        this.growBlocks = growBlocks;
        this.slowdown = slowdown;
    }
}
