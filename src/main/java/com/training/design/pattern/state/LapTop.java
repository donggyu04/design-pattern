package com.training.design.pattern.state;

import com.training.design.pattern.state.state.Off;
import com.training.design.pattern.state.state.PowerState;

public class LapTop {

    private PowerState powerState;

    public LapTop() {
        powerState = new Off();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        powerState.powerPush();
    }

    public void changeStateAndPush(PowerState powerState) {
        this.powerState = powerState;
        powerPush();
    }
}
