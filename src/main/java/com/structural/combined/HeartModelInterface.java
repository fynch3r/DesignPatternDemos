package com.structural.combined;

public interface HeartModelInterface {
   public int getHeartRate();
   public void registerObserver(BeatObserver o);
   public void removeObserver(BeatObserver o);
   public void registerObserver(BPMObserver o);
   public void removeObserver(BPMObserver o);
}
