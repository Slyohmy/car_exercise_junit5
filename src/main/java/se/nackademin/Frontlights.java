package se.nackademin;

public class Frontlights {
    private boolean turnedOn;
    private boolean fullLights;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public boolean isFullLights() {
        return fullLights;
    }

    public void setFullLights(boolean fullLights) {
        this.fullLights = fullLights;
    }
}
