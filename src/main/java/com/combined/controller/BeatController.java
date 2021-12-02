package com.combined.controller;

import com.combined.BeatModelInterface;
import com.combined.ControllerInterface;
import com.combined.DJView;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 16:55
 **/


public class BeatController implements ControllerInterface {
    // 两层中间，所以都有需要操作
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model, DJView view) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }
    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }
    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }
    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }
    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
