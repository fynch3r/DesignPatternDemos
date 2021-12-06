package com.structural.combined.controller;

import com.structural.combined.ControllerInterface;
import com.structural.combined.DJView;
import com.structural.combined.HeartModelInterface;
import com.structural.combined.adapter.HeartAdapter;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 17:11
 **/


public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {}

    public void stop() {}

    public void increaseBPM() {}

    public void decreaseBPM() {}

    public void setBPM(int bpm) {}
}
