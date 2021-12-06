package com.structural.combined.adapter;

import com.structural.combined.BPMObserver;
import com.structural.combined.BeatModelInterface;
import com.structural.combined.BeatObserver;
import com.structural.combined.HeartModelInterface;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 17:06
 **/


public class HeartAdapter implements BeatModelInterface {

    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
