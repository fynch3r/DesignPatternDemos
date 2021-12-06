package com.structural.combined;

public interface BeatModelInterface {
    public void initialize();
    public void on();
    public void off();
    public void setBPM(int bpm);
    public int getBPM();
    public void registerObserver(BeatObserver o);
    public void removeObserver(BeatObserver o);
    public void registerObserver(BPMObserver o);
    public void removeObserver(BPMObserver o);
}
